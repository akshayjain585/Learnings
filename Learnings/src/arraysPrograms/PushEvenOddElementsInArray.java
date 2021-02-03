package arraysPrograms;

public class PushEvenOddElementsInArray {
	
	public static void pushEvenOdd(int[] arr, int n) {
		
		   int j = 0,temp; 
		      
	        // quick sort method 
	        for (int i = 0; i < n; i++) { 
	      
	            // if array of element 
	            // is odd then swap 
	            if (arr[i] % 2 == 0) { 
	      
	                // increment j by one 

	                // swap the element 
	                temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp; 
	                j++;
	                
	            } 
	        }
	        
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}

	}
	
	public static void main(String[] args) {
		int[] list = {10,33,43,54,29,39,22,34,56};
		
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
		pushEvenOdd(list,list.length);
	}

}
