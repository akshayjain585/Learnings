package stringsPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
	
	public static void checkAnagram(String s1, String s2){
		
		if(s1.length()!=s2.length()){
			System.out.println("Invalid input");
			return;
		}else{
			char[] ch1 = s1.toLowerCase().toCharArray();
			char[] ch2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			// or we can directly compare both arrays as well like : Arrays.equals(ch1,ch2); It returns boolean
			String s11 = new String(ch1);
			String s22 = new String(ch2);
			if(s11.equals(s22)){
				System.out.println("Strings are anagram");
			}else{
				System.out.println("Strings are not anagram");
			}
		}	
}
	
	public static boolean checkAnagramUsingMap(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() != s2.length()) {
			return false;
		}
		
		char[] ch = s1.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<ch.length; i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i],map.get(ch[i])+1);
			}else {
				map.put(ch[i], 1);
			}
		}
		
		char[] ch1 = s2.toLowerCase().toCharArray();
		for(int i=0; i<ch1.length; i++) {
			if(map.containsKey(ch1[i]) && map.get(ch1[i]) > 0) {
				map.put(ch1[i],map.get(ch1[i])-1);	// Removing the key if found to avoid giving the true result if there is an another character of same alphabet.
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		String s1 = "listen";
		String s2 = "silent";
		checkAnagram(s1,s2);
		System.out.println("Using another method");
		System.out.println(checkAnagramUsingMap(s1,s2));
	}
	
}