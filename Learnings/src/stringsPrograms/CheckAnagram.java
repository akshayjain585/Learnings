package stringsPrograms;

import java.util.Arrays;

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
			String s11 = new String(ch1);
			String s22 = new String(ch2);
			if(s11.equals(s22)){
				System.out.println("Strings are anagram");
			}else{
				System.out.println("Strings are not anagram");
			}
		}
		
		
}
	
	public static void main(String[] args){
		
		String s1 = "Liste";
		String s2 = "Silent";
		checkAnagram(s1,s2);
	}
	
}