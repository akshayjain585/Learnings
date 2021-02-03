package leetCode.Easy;

/*
 * Ref : https://leetcode.com/problems/isomorphic-strings/submissions/
 * Isomorphic : If one key is mapped to one value in other string, it has to preserve that value always.
 * Approach :
 * Store the mapping with key of first String and value of second string.
 * 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
	
    public static boolean isIsomorphic(String s, String t) {
        
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            char ch1 = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) != ch1){		// Everytime the key exists, checking if it is mapped to same value or not of second string.
                    return false;
                }
            }else{
                if(set.contains(ch1)){
                    return false;
                }else{
                map.put(ch,ch1);	//Store the mapping with key of first String and value of second string.
                set.add(ch1); 		// Checking if the value already exists in set or not, before adding the same value to another key.
                }

            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
