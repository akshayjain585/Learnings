package sorting;


/*
 * 1. In j loop, -i because after one iteration of 'i', the largest element will be at last
 * 2. -1 because, To compare second last element to last, else it will go array out of bound
 * Best Case complexity : O(n) (Already sorted array)
 * Worst case complexity: O(n^2) 
 * Average Case complexity: O(n^2)
 * Space Complexity: O(1) (Only temp variable required)
 * 
 */

public class BubbleSort {
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}
		
	}
	
	public static int[] bubbleSort(int[] list){
		
		for(int i=0; i<list.length-1; i++){
			for(int j=0; j<list.length-i-1; j++){
				if(list[j] > list[j+1]){
					int temp = list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {23,12,40,39,10,4};
		System.out.println("List before Sorting: ");
		printArray(num);
		
		System.out.println();

		bubbleSort(num);
		System.out.println("List after sorting using Bubble Sort: ");
		printArray(num);

	}

}
