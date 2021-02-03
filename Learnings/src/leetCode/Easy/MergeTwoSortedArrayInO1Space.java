package leetCode.Easy;

/*
 * https://leetcode.com/problems/merge-sorted-array/submissions/
 * Time : O(nums1 + nums2)
 * Space : O(1)
 */

public class MergeTwoSortedArrayInO1Space {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        
	        int i = m-1;    // last index till element is present in nums1
	        int j = n-1;    // last index till element is present in nums2
	        int k = m+n - 1;    // last index of nums1
	        
	        while(i>=0 && j >=0){
	            if(nums1[i] >= nums2[j]){
	                nums1[k] = nums1[i];
	                i--;
	            }else {
	                nums1[k] = nums2[j];
	                j--;
	            }
	            k--;
	        }
	        
	        while(j>=0){    // If any elements are left out in nums2
	            nums1[k] = nums2[j];
	            j--;    // Reduce the size of nums2
	            k--;    // Reduce the size of merged array
	        }       
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list1 = {1,2,3,0,0,0};
		int[] list2 = {2,5,6};
		int m = 3;
		int n = 3;
		merge(list1,m,list2,n);
		for(int i=0; i<list1.length; i++) {
			System.out.print(list1[i]+" , ");
		}
		System.out.println();
		
	}

}
