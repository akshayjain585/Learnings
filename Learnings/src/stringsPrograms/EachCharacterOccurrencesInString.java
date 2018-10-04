package stringsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EachCharacterOccurrencesInString {
	
	public static void charOccurrences(String input){
		String toLowerCase = input.toLowerCase();
		char[] ch = toLowerCase.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c:ch){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Character> set = map.keySet();
		for(Character key: set){
			System.out.print(key+""+map.get(key));
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "All is well";
		String input1 = "aaaabbbbbcccffg";
		
		//charOccurrences(input);
		charOccurrences(input1);
		

	}

}
