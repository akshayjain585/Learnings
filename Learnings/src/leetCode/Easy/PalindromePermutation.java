package leetCode.Easy;

/*
 * Ref : https://leetcode.com/problems/palindrome-permutation/solution/
 * Time : O(n) : We traverse over the string ss of length nn once only.
 * Space : O(1) : In both map and set : The set can grow up to a maximum number of all distinct elements. However, the number of distinct characters are bounded, so as the space complexity.
 * 
 * Approach : We know that for a palindrome string of even length has all characters appears even number of times. And if any string which is of odd length and palindrome has all characters appeared even except one character which must have come odd.
 * So, we just need to check if the count of odd character reaches more than 1 or not using Map/Set.
 * Example :
 * nitin (Odd length): n,2 || i,2 || t,1
 * mama (Even length): m,2 || a,2
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PalindromePermutation {
	
	public static boolean palindromePermutationUsingMap(String input) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		
		int count = 0;
		for(char key : map.keySet()) {
			if(map.get(key) %2 != 0) {
				count ++;
			}
		}
		
		return count <= 1;		// This will return true/false based on the value of count. if count is <=1, will return true else false. Helps in avoiding the loop.
	}
	
	
	public static boolean palindromePermutationUsingSet(String input) {
		
		Set<Character> set = new HashSet<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(set.contains(ch)) {
				set.remove(ch);		// Removing the character if found to maintain zero characters those who have appeared twice.
			}else {
				set.add(ch);		// Adding only those characters which are distinct in string. If we have done, just set.add() avoiding the above logic, it would have added all characters atleast once.
			}
		}
		
		return set.size() <= 1; 	// In last I will have set having only distinct characters as we eliminated duplicate characters by not adding them even once.
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aab";
		System.out.println(palindromePermutationUsingSet(input));

	}

}
