/*
 * Complexity is O(nLogn) for Best and Average case but O(n2) for Worst Case
 * Quick Sort is preferred over MergeSort for sorting Arrays : It doesn’t require any extra storage whereas merge sort requires O(N) extra storage for merged Array
 * MergeSort is preferred over QuickSort for Linked Lists : Due to difference in memory allocation of arrays and linked lists. In linked list, we can insert items in the middle in O(1) extra space and O(1) time. 
 * 
 */

package sorting;

public class QuickSort {

	public static void printArray(int[] list){
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}

	public static void quickSort(int[] list, int start, int end){
		if(start<end){
			int pIndex = partition(list,start,end);
			quickSort(list,start,pIndex-1);
			quickSort(list,pIndex+1,end);
		}
	}

	public static int partition(int[] list, int start, int end){

		int pivot = list[end];
		int pIndex = start;
		for(int i=start; i<end; i++){
			if(list[i]<=pivot){
				int temp = list[i];
				list[i]=list[pIndex];
				list[pIndex]=temp;
				pIndex++;
			}
		}
		int temp = list[pIndex];
		list[pIndex]=list[end];
		list[end]=temp;
		return pIndex;
	}
	
	public static void main(String[] args){
		int[] list = {23,12,40,39,10,4};
		int start =0;
		int end = list.length-1;
		System.out.print("List before Quick Sort: ");
		printArray(list);
		System.out.println();
		quickSort(list, start, end);
		System.out.print("List after Quick Sort: ");
		printArray(list);

	}

}
