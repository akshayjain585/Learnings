package leetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * Approach : The difference of indices of duplicate elemnets should be equal to atmost k place.
 */

public class ContainsDupDiffOfIndices {
	
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int currentVal = map.get(nums[i]);
                if(Math.abs(i - currentVal) <= k){
                    return true;
                }
                map.put(nums[i],i);
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = {1,2,3,1};
		int list1K = 3;
		
		System.out.println(containsNearbyDuplicate(list1,list1K));
		
		int[] list2 = {1,2,3,1,2,3};
		int list2K = 2;
		
		System.out.println(containsNearbyDuplicate(list2,list2K));
		
	}

}
