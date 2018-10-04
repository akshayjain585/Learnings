package sorting;

public class BubbleSortRecursive {
	
	public static void printList(int[] list){
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+ " ");
		}
	}
	
	public static int[] bubbleSortRec(int[] list, int n){
		
		if(n == 1){
			return list;
		}
		for(int i=0; i<list.length-1; i++){
			if(list[i] > list[i+1]){
				int temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
			}
			
			bubbleSortRec(list, n-1);
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {23,12,40,39,10,4};
		int n = list.length-1;
		System.out.println("Before sorting");
		printList(list);
		
		System.out.println();
		
		System.out.println("After Sorting");
		bubbleSortRec(list, n);	
		printList(list);

	}

}
