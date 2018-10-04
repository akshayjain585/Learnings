package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {
	
	public static void duplicateCharacters(String input){
		String inLowerCase= input.toLowerCase();
		char[] characters = inLowerCase.toCharArray();
				
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char key:characters){
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		
		Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
		for(Map.Entry<Character, Integer> keyset: entrySet){
			if(keyset.getValue()>1){
				System.out.println(keyset);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input= "Akshay";
		duplicateCharacters(input);
		

	}

}
