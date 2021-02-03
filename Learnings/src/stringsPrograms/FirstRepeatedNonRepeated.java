package stringsPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatedNonRepeated {
	
	public static void repeatedNonRepeated(String input){
		
		String lc = input.toLowerCase();
		char[] ch = lc.toCharArray();
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(char c:ch){
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		//Will not use Set and .keySet returns HashSet which doesn't maintain the order
		//Set<Character> set =  map.keySet();
		// Actual reason is this : Have not converted it into set to iterate the map because we want to iterate to each and every character rather iterating the map with values.
		for(char c:ch){
			if(map.get(c)==1){
				System.out.println("The first non repeated character in String is "+c);
				break;
			}
		}
		
		for(Character c:ch){
			if(map.get(c)>1){
				System.out.println("The first repeated character in String is: "+c);
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = scan.nextLine();
		
		repeatedNonRepeated(input);
		

	}

}
