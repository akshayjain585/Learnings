package leetCode.Easy;

/*
 * https://leetcode.com/problems/roman-to-integer/solution/ , https://www.educative.io/edpresso/the-roman-to-integer-problem
 * 
 * Time : O(1)
 * Space : O(1)
 * 
 * Approach :
 * 1. Compare i and i+1 value, if i >= then add to sum else subtract from sum.
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static int romanToInt1(String s) {
		
		Map<Character, Integer> map = new HashMap<>();

		map.put('M',1000);
		map.put('D',500);
		map.put('C',100);
		map.put('L',50);
		map.put('X',10);
		map.put('V',5);
		map.put('I',1);

		int aS = 0; 

		// Running the below loop till second last element as we are comparing with i+1
		for(int i=0; i<s.length()-1; i++) {
			if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
				aS = aS + map.get(s.charAt(i));
			}else {
				aS = aS - map.get(s.charAt(i));
			}
		}
		// Adding here the last character as running the loop till second last element.
		aS = aS + map.get(s.charAt(s.length()-1));
		return aS;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String val = "MCMXCIV"; 	// M + (M - C) + (C - X) + (V - I) : 1000 + (900) + (90) + (4) : 1994
		String val1 = "CMXCIV";
		System.out.println(romanToInt1(val)); 
		System.out.println(romanToInt1(val1)); 
	}

}
