package searching;

/*
 * Preferred way of calculating mid is : mid = start + (end - start)/2
 * Reason : if value of start or end or both is INT_MAX, it will cause integer overflow.
 * Also, above formula will drive the same legacy formula only which is (start + end)/2;
 */

public class BinarySearch {
	
	public static int binarySearch(int[] list, int key){
		int start = 0;
		int end = list.length -1;
		while(start<=end){
			int mid = (start+end)/2;
			if(list[mid]==key){
				return mid;
			}if(list[mid]<key){
				start = mid +1;
			}else{
				end = mid -1;
			}
		}
		return -1;

	}
	
	/*
	 * https://leetcode.com/problems/search-insert-position/submissions/
	 * Problem : Search index and if not available, find out what should have been the inserted index for the target
	 */
	
    public int searchInsertPosition(int[] nums, int target) {
        // Linear approach
        
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] == target){
    //             return i;
    //         }else if(nums[i] > target){
    //             return i;
    //     }
    // }
    //     return nums.length;	// Returning num.length index as the target element could be greater than all of the present element in the list
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return start;	// We will return start/left index to return the could be inserted position.
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {2, 4, 6, 8, 10, 12, 14, 16};
		int result = binarySearch(array,2);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Element found at index: "+result);
		}

	}

}