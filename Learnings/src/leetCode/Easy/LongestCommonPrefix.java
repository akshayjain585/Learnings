package leetCode.Easy;

/*
 * Ref : https://leetcode.com/problems/longest-common-prefix/solution/ , https://www.educative.io/edpresso/how-to-find-the-longest-common-prefix-in-an-array-of-strings
 * Approach : 
 * 
 *1. Handle special cases.
 *2. Sort the array so that the largest length of the string in array comes at 0th index and start comparing the index of 0th index string to the index of last string in array.
 *3. Whenever the character doesn;t match, till then the longest prefix.  
 *
 *Time : O(S) : Sum of all characters
 *Space : O(1) : Constant space
 */

import java.util.Arrays;

public class LongestCommonPrefix {
	
public static String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0){
            return "";
        }else if(strs.length == 1){
            return strs[0];
        }
        // Sorting the array so that the largest length of string can come at first index in array.
        Arrays.sort(strs);
        
        // Using string builder as operations at String takes more memory due to immutable
        StringBuilder sb = new StringBuilder();
        
        // Running the loop on first index as thats the highest length
        for(int i=0; i<strs[0].length(); i++){
        	// Comparing the character between the first index String's first character with last index String's first character
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                sb = sb.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        String res = sb.toString();
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"flower","flow","flight"};
		String[] input1 = {"mint", "mini", "mineral"};
		System.out.println(longestCommonPrefix(input));
		System.out.println(longestCommonPrefix(input1));
	}

}
