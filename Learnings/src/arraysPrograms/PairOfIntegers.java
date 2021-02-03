package arraysPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairOfIntegers {
	
	public static void pair(int[] list, int key){
		
//		for(int i=0; i<list.length; i++){
//			int first = list[i];
//			for(int j=i+1; j<list.length; j++){
//				int second = list[j];
//				if(first + second == key){
//					System.out.println(list[i] + ","+ list[j]);
//				}
//			}
//		}
		boolean pair = false;
		for(int i=0; i<list.length; i++){
			for(int j=i+1; j<list.length; j++){
				if(list[i] + list[j] == key){
					System.out.println(list[i]+","+list[j]);
					pair = true;
				}
			}
		}
		if(!pair){
			System.out.println("Pair not found");
		}
	}
	
	public static void pairLessComplexity(int[] list, int key){
		if(list.length<2){
			return;
		}
		Set<Integer> s = new HashSet<>();
		for(int value : list){
			int target = key - value;
			if(s.contains(target)){
				System.out.println(value+","+target);
			}else{
				s.add(value);
			}
		}	
	}
		
		// Returning indices of numbers if pair is found. Solution is such that only one pair can be found, from leetcode. Thats why have put return statement to not continue looking for other numbers.
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
	
	
	public static void main(String[] args){
		
		int[] list = {2,4,3,5,7,8,9};
		//pair(list,7);
		pairLessComplexity(list,7);
		int[] res = twoSum(list,100);
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" , ");
		}
	}

}
