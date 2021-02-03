package searching;

public class FirstLastOccurrenceInSortedList {

	public static int firstOccurrenceBS(int[] list, int key){
		int start = 0;
		int end = list.length-1;
		int result = -1;   //Return -1 if we don't find element in an array
		while(start<=end){
			int mid = (start+end)/2;
			if(key == list[mid]){
				result = mid; //Store the first occurrence of an element in an array rather than returning mid index
				end = mid-1; //To continue searching for other occurrence on left side means first occurrence since we are decrementing the value of end.
				//start = mid+1; //To continue searching for other occurrence on right side means last occurrence since we are incrementing the value of start.
			}else if(key < list[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}

		return result;
	}

	public static int lastOccurrenceBS(int[] list, int key){
		int start = 0;
		int end = list.length-1;
		int result = -1;   //Return -1 if we don't find element in an array
		while(start<=end){
			int mid = (start+end)/2;
			if(key == list[mid]){
				result = mid; //Store the first occurrence of an element in an array rather than returning mid index
				//end = mid-1; //To continue searching for other occurrence on left side means first occurrence since we are decrementing the value of end.
				start = mid+1; //To continue searching for other occurrence on right side means last occurrence since we are incrementing the value of start.
			}else if(key < list[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}

		return result;
	}
	
	/*
	 * Ref : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
	 * Problem : First and last occurence using same method
	 *
	 */
	
    public static int firstAndLastOccurence(int[] nums, int target , boolean leftRight){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                res = mid;
                if(leftRight){
                  end = mid-1;  
                }else {
                    start = mid +1;
                }
            }else if(nums[mid] < target){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return res;
    }
	
	/*
	 * Ref : https://leetcode.com/problems/first-bad-version/solution/
	 * Problem : Find out the first/last bad version of a product due to which after all the corresponding versions are bad. You are given a function which returns boolean to confirm if a function is bad or good
	 * Time : O(logn), Space : O(1) 
	 * Function given : boolean isBadVersion(int version)
	 */
	
	// Just for showing purpose.
	public static boolean isBadVersion(int version) {
		return true;
	}
	
	public static int firstLastBadVersion(int latestVersion) {
		int start = 0;
		int end = latestVersion;
		while(start < end) {
			int mid = (start+end)/2;
			if(isBadVersion(mid)) {
				end = mid;	// Setting end to mid as we need to traverse to our left to find the first occurrence. Not setting it to mid-1 because this could itself be the first version.
			}else {
				start = mid + 1; //(If middle version is not bad then the bad version exists to the right of mid)
			}
		}
		return start;	// Returning start as we need to return the first bad version, not last.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {1,2,4,7,8,9,9,9,10,12};
		int key = 9;
		System.out.println(FirstLastOccurrenceInSortedList.firstOccurrenceBS(list, key));
		System.out.println(lastOccurrenceBS(list,key));
	}

}
