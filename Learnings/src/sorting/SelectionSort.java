package sorting;

/*Best Case: O(n^2)
* Worst case complexity: O(n^2) 
* Average Case complexity: O(n^2)
* Space Complexity: O(1) (Only temp variable required)
*/

public class SelectionSort {
	
	public static void printArray(int[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+ " ");
		}

	}
	
	public static int[] selectionSort(int[] list){
		
		for(int i=0; i<list.length-1; i++){
			int minIndex= i;
			for(int j=i+1; j<list.length; j++){
				if(list[minIndex] > list[j]){
					minIndex = j;
				}
				
			}
			int temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[] = {23,12,40,39,10,4};
		
		System.out.println("List before Sorting: ");
		printArray(num);
		
		System.out.println();
		
		selectionSort(num);
		System.out.println("List after sorting using Selection sort: ");
		printArray(num);

	}

}
