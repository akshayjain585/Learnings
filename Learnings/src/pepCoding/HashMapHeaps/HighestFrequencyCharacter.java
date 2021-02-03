package pepCoding.HashMapHeaps;

/*
 * Problem : Find the max frequency character. 
 * Ex: "abrakadabraaa" : "a" character has come maximum times.
 */

import java.util.HashMap;

public class HighestFrequencyCharacter {
	
	public static char highestFreqChar(String input) {
		
		char hfc[] = input.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(Character key : hfc) {
			// If map contains key then update the key by getting the current value + 1
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			} else {
				map.put(key, 1);
			}
		}
		
		System.out.println(map);
		
		// Consider that the first character has the highest frequency in the input given and then compare below by traversing to all its keys and values using keyset()
		char maxFreqChar = input.charAt(0);
		
		for(Character key: map.keySet()) {
			
			// If any of key in the keyset() has more value than the considered one, assign the key as max freq character
			if(map.get(key) > map.get(maxFreqChar)) {
				maxFreqChar = key;
			}
		}		
		return maxFreqChar;
		
	}
	
	
	public static void main(String[] args) {
		String input = "abrakadabraaa";
		char res = highestFreqChar(input);
		System.out.println(res);
	}

}
