package searching;

/*
 * trick to apply binary search in sorted portion and ideally there will always be one sorted portion either left/right depending on the circular sorted array.
 */

public class CircularSortedArray { 
	
	public static int circularSA(int[] list, int key){
		int start = 0;
		int end = list.length-1;
		
		// iterate till search space contains at-least one element
		while(start<=end){
			int mid = (start+end)/2;
			
			// if key is found, return its index
			if(list[mid]==key){
				return mid;
			}
			
			// if right half (list[mid..right]) is sorted and mid is not
			// the key element
			if(list[mid]<=list[end]){
				
				// compare key with list[mid] and list[right] to know
				// if it lies in list[mid..right] or not
				if(list[mid] < key && list[end] >= key){
					start = mid+1;	// go searching in right sorted half
				}else{
					end = mid-1;	// go searching left
				}
				// compare key with list[left] and list[mid] to know
				// if it lies in list[left..mid] or not
			}else{
				if(list[start]<=key && list[mid] > key){
					end = mid-1;	// go searching in left sorted half
				}else{
					start = mid+1;	// go searching right
				}
			}
		}
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {12,14,18,21,25,3,6,8};
		int key = 8;
		System.out.println(circularSA(list,key));
		

	}

}
