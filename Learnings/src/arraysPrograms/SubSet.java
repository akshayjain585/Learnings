package arraysPrograms;

/*
 * ref : Good to read to know the difference between SubArray-SubString/SubSequence/SubSet : https://www.techiedelight.com/difference-between-subarray-subsequence-subset/
 * SubArray-SubString: As name says, slice of an array/string which is contiguous.
 * SubSequence : Need not be contiguous but maintains the order.
 * SubSet : Could be in any order.
 * 
 * Example : {1,2,3,4}
 * SubArray : {1,2}
 * SubSequence : {1,4}
 * SubSet : {3,1}
 * 
 * Note : All subArray are subsequence and subset as subArray is contiguous which satisfies both the subsequence and subset
 * 
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SubSet {
		
	public static boolean isSubSet(int[] list1, int[] list2) {
		Map<Integer,Integer> map = new HashMap<>();	 // Using map to handle duplicate values as well for cases like {1,4,4,2} is not a subset of {1,4,2}
		
		for(int i=0; i<list1.length; i++) {
			if(map.containsKey(list1[i])) {
				map.put(list1[i],map.get(list1[i])+1);
			}else {
				map.put(list1[i],1);
			}
		}
		
		for(Integer key : list2) {
			if(map.containsKey(key) && map.get(key) > 0) {
				map.put(key,map.get(key)-1);		//for cases like {1,4,4,2} is not a subset of {1,4,2}
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] list1 =  {1,4,2,1,5,6,7};
		int[] list2 = {4,1,1,2};
		
		System.out.println(isSubSet(list1,list2));
	}

}
