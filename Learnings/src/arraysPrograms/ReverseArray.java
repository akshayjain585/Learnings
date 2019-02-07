package arraysPrograms;

public class ReverseArray {
	
	public static void iterativeReverse(int[] list){
		int start = 0;
		int end = list.length-1;
		while(start<end){
			int temp = list[start];
			list[start]=list[end];
			list[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void recursiveReverse(int[] list, int start, int end){
		if(start>=end){
			return;
		}
		int temp = list[start];
		list[start]=list[end];
		list[end]=temp;
		recursiveReverse(list,start+1,end-1);

	}
	
	public static void printArray(int[] list){
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}
	
	public static void stringTypeReverse(int[] list){
		
		for(int i=list.length-1; i>=0; i--){
			System.out.print(list[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {1,2,3,4,5,6,7,8,9,10};
		int[] list1 = {1,2,3,4,5,6,7,8,9,10};
		int[] list2 = {1,2,3,4,5,6,7,8,9,10};
		
		int start = 0;
		int end = list.length-1;
		iterativeReverse(list);
		printArray(list);
		System.out.println();
		recursiveReverse(list1,start,end);
		printArray(list1);
		System.out.println();
		stringTypeReverse(list2);

	}

}
