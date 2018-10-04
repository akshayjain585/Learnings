package sorting;

/* 1. Always start from index 1 taking that as key and comparing elements to the left
 * 2. Sorts the entire array in one GO.
 * Best Case complexity : O(n) (Already sorted array)
 * Worst case complexity: O(n^2) 
 * Average Case complexity: O(n^2)
 * Space Complexity: O(1) (Only temporary variable required as key)

 */

public class InsertionSort {
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
		
	}

	public static int[] insertionSort(int[] list){
		
		for(int j=1; j<list.length; j++){
			int key = list[j];
			int i = j-1;
			while(i>=0 && list[i]>key){
				list[i+1] = list[i];
				i--;
			}
			list[i+1]=key;
		}
		
		return list;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {23,12,40,39,10,4};
		System.out.println("List before Sorting: ");
		printArray(num);
		
		System.out.println();

		insertionSort(num);
		System.out.println("List after sorting using Insertion Sort: ");
		printArray(num);

	}

}
