package leetCode.Easy;

/*
 * Time : O(n)
 * Space : O(1)
 */

public class RemoveDuplicatesFromSortedArray {
	
	// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	public static int removeDuplicatesInSortedArray(int[] list) {
		if(list.length == 0 || list.length == 1) {
			return list.length;
		}
		
		int count = 0;
		for(int i=0; i<list.length -1; i++) {
			if(list[i] != list[i+1]) {
				list[count] = list[i];
				count++;
			}
		}
		list[count] = list[list.length -1];	// To store the last index as we are running the loop till second last.
		return count+1;	// + 1 as need to return the length not the index.
	}
	
	
	// Ref : https://leetcode.com/problems/remove-element/submissions/
	    public static int removeElement(int[] nums, int val) {
	        
	        int count = 0;
	        for(int i =0; i<nums.length; i++){
	            if(nums[i] != val){
	                nums[count] = nums[i];
	                count++;
	            }
	        }
	        return count;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {1,1,2};
		int[] list2 = {3,2,2,3};
		int val = 3;
		System.out.println("Length is "+removeDuplicatesInSortedArray(list1));
		System.out.println("Length is "+removeElement(list2,val));
		

	}

}
