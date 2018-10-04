/*
 * Complexity is O(nLogn) in Best,Worst and Average Cases and Space complexity is O(n)
 * Under merge function : Merge the arrays
 * Under mergeSort function : Break the arrays till the length is 1 and call merge function.
 */

package sorting;

public class MergeSort {
	
	public static void printArray(int[] list){
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}
	
	public static void merge(int[] left, int[] right, int[] merged){
		int nLeft = left.length;
		int nRight = right.length;
		int i = 0, j = 0,k = 0;
		while(i<nLeft && j<nRight){
			if(left[i]<right[j]){
				merged[k]=left[i];
				i++;
			}else{
				merged[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<nLeft){
			merged[k]=left[i];
			i++;
			k++;
		}
		while(j<nRight){
			merged[k]=right[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] list){
		int n = list.length;
		if(n==1){
			return;
		}
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n-mid];
		for(int i=0; i<mid; i++){
			left[i] = list[i];
		}
		for(int i=mid; i<n; i++){
			right[i-mid]=list[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,list);		
	}
	
	public static void main(String[] args){
		int[] list = {23,12,40,39,10,4};
		System.out.print("List before Merge Sort: ");
		printArray(list);
		System.out.println();
		mergeSort(list);
		System.out.print("List after Merge Sort: ");
		printArray(list);

	}

}
