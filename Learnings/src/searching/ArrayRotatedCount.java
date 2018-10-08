/*
 * 1. Trick is to find the minimum element in an array and that would be the number of times array is rotated.
 * Example : {10,11,12,13,2,3,4,5}
 * Ans. 2 is the minimum element at index 4, so the array is rotated 4 number of times.
 * Actual Array : {2,3,4,5,10,11,12,13} : And if its rotated 4 times, it would be {10,11,12,13,2,3,4,5}
 *
 *Solution 1 : Use linear search and find minimum element and return the index. O(n)
 *Solution 2 : Use Binary Search and find minimum element and return the index. O(Logn)
 *
 */


package searching;

public class ArrayRotatedCount {
	
	public static int rotatedCountLS(int[] list){   //Solution 1 using Linear Search O(n)
		int min = list[0];
		int minIndex = 0;
		for(int i=1; i<list.length; i++){
			if(list[i]<min){
				min = list[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static int rotatedCountBS(int[] list){	//Solution 2 using Binary search O(Logn)
		int start = 0;
		int end = list.length-1;
		while(start<=end){
			if(list[start]<=list[end]){			//This will result that array is sorted so first element is smallest one.
				return start;
			}
			//To find Pivot, we should find the element which is smaller than the previous and next element and thats the smallest element and the point from which array is rotated.
			int mid = (start+end)/2;		
			int next = (mid+1)%list.length;			//Used %list.length to put next element as first element if mid is last element since the output would be 0 in that case.
			int prev = (mid-1 + list.length)%list.length; //Added list.length to avoid negative value if mid is first element.
			if(list[mid]<=prev && list[mid]<=next){
				return mid;
			}else if(list[mid]<=end){	//This means the right array is sorted so the minimum element lies in first half so decrement the end value.
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {10,11,12,13,2,3,4,5};
		int[] list1 = {2,3,4,5,10,11,12,13};
		System.out.println(rotatedCountLS(list));
		System.out.println(rotatedCountBS(list1));
		
	}

}
