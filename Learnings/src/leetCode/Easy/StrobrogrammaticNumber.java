package leetCode.Easy;
/*
 * https://leetcode.com/problems/strobogrammatic-number/
 * 
 * Time : O(n)
 * Space : O(1)
 * 
 */

import java.util.HashMap;
import java.util.Map;

public class StrobrogrammaticNumber {
	
    public static boolean isStrobogrammatic(String num) {
        
        if(num == null || num.length()==0){
            return true;
        }
        
        Map<Character,Character> map = new HashMap<>();
        
        map.put('1','1');
        map.put('8','8');
        map.put('0','0');
        map.put('6','9');
        map.put('9','6');
        
        int sI = 0;
        int eI = num.length()-1;
        
        while(sI <= eI){
        	// The last character of string should be present in map and first character should be equal to last character value
        	//Below line of code means : If map doesn't contain the last character of string or first character of string is not equal to value of last character then false
        if(!map.containsKey(num.charAt(eI)) || num.charAt(sI) != map.get(num.charAt(eI))){
                return false;
            }
            sI ++;
            eI --;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
