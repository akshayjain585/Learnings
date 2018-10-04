package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountVowels{

	public static void duplicateWords(String input){
		String toLowerCase = input.toLowerCase();
		String words[] = toLowerCase.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String key: words){
		
		if(map.containsKey(key)){
			map.put(key,map.get(key)+1);
		}else{
			map.put(key,1)	;	
		}
		}
		
		Set<String> s = map.keySet();
		for(String key:s){
			if(map.get(key)>1){
				System.out.println("Key is "+key+" and the value is "+map.get(key));
			}
		}
	
	}
	
	public static void duplicateChar(String input){
			String toLowerCase = input.toLowerCase();
			char[] inChar = toLowerCase.toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			
			for(Character key: inChar){
				if(map.containsKey(key)){
					map.put(key, map.get(key)+1);
				}else{
					map.put(key, 1);
				}
			}
			

			Set<Character> set = map.keySet();
			for(Character key:set){
				if(map.get(key)>1){
					System.out.println("Duplicate char is "+key +" and the value is "+map.get(key));
				}
			}
		
	}
	
	public static void countWords(String input){
		String[] words = input.split(" ");
		int count = 0;
		for(int i=0; i<words.length; i++){
			count ++;
		}
		System.out.println("The words are "+count);
	}
	
	public static void countVowels(String input){
		char[] ch = input.toCharArray();
		int count =0;
		for(int i=0; i<ch.length; i++){
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
				count++;
			}
		}
		System.out.println("Total vowels are "+count);
	}
		
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scan.nextLine();
		duplicateWords(input);
		duplicateChar(input);
		countWords(input);
		countVowels(input);
	}

}