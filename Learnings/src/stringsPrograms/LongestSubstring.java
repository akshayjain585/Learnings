package stringsPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstring {
	
	/*
	 * Reference : https://stackoverflow.com/questions/9734474/find-longest-substring-without-repeating-characters
	 */	
		public static void longestSubStringStackOverFlow(String input){
			char[] c = input.toCharArray();
			Set<Character> set = new LinkedHashSet<>();
			String actualLongestSubString = "";
			String templongestSubString = "";
			for(Character key : c){
				if(set.contains(key)){
					templongestSubString = "";
					set.clear();
				}
				templongestSubString = templongestSubString + key ;
				set.add(key);
				if(templongestSubString.length() > actualLongestSubString.length()){
					actualLongestSubString = templongestSubString;
				}
			}
			System.out.println(actualLongestSubString+" and the length is : "+actualLongestSubString.length());
		}
		
	public static void main(String[] args){
		String input = "abcabcbb";
		String input1 = "GEEKSFORGEEKS";
		String input2 = "dvdf";
		longestSubStringStackOverFlow(input1);
		longestSubStringStackOverFlow(input);
		longestSubStringStackOverFlow(input2);
	}
}
