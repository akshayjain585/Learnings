package leetCode.Easy;

/*
 * Time : O(n)
 * Space : O(n)
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[] {-1,-1};
    }
    
    public static void main(String[] args) {
    	int[] nums = {2,7,11,15};
    	int target = 9;
    	int[] res = twoSum(nums,target);
    	for(int i=0; i<res.length; i++) {
    		System.out.print(res[i]+" , ");
    	}
    	System.out.println();
    }

}
