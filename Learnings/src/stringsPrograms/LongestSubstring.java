package stringsPrograms;

import java.util.LinkedHashMap;

public class LongestSubstring {

	public static void longestSubstring(String input){
		
		char[] ch = input.toCharArray();
		String longestSubString = null;
		int subStringLength = 0;
		LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		
		for(Character key: ch){
			if(map.containsKey(key)){
				int i = map.get(key);
				map.clear();
			}else{
				map.put(key, 1);
			}
		}
		 
		if(map.size() > subStringLength){
			subStringLength = map.size();
			longestSubString = map.keySet().toString();
		}
		System.out.println("Input String is "+input);
		System.out.println("The longest substring is "+longestSubString+" and the length is "+subStringLength);
		
	}
	
public static void longestSubstringg(String input){
		
		char[] ch = input.toCharArray();
		String longestSubString = null;
		int subStringLength = 0;
		LinkedHashMap<Character,Integer> map = new LinkedHashMap();
		
		for(int i=0; i<ch.length; i++){
			char key = ch[i];
			if(map.containsKey(key)){
				  i = map.get(key);
				map.clear();
			}else{
				map.put(key, 1);
			}			
		}
		if(map.size() > subStringLength){
			subStringLength = map.size();
			longestSubString = map.keySet().toString();
		}
		System.out.println("Input String is "+input);
		System.out.println("The longest substring is "+longestSubString+" and the length is "+subStringLength);
		
	}
	
	public static void main(String[] args){
		String input = "abcabcbb";
		//longestSubstringg(input);
		longestSubstring(input);
	}
}
