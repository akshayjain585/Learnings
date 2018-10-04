package arraysPrograms;

public class SortArrayMultipleIterators {
	
	//Method 1: Use two iterators and continue checking left index with right one.
	
	public static void sortArray(int[] list){
		int left = 0;
		int right = list.length-1;
		
//		for(int i=0,j=list.length-1; i<list.length & j>=0;){
//		}
		while(left<right){
			if(list[left]<list[right]){
				left++;
				right--;
			}else if(list[left]>list[right]){
				int temp = list[left];
				list[left]=list[right];
				list[right]=temp;
				left++;
				right--;
			}else if(list[left]==list[right]){
				if(list[left]==0){
					left++;
				}else if(list[right]==1){
					right--;
				}
			}
		}

	}
	
//	Method 2: Count the number of 0 and add it in the loop and add remaining 1 till the length of the loop.
	
	public static void sortArrayUsingCount(int[] list){
		int count =0;
		for(int i=0; i<list.length; i++){
			if(list[i]==0){
				count++;
			}
		}
		
		for(int i=0; i<count; i++){
			list[i]=0;
		}
		
		for(int i=count; i<list.length; i++){
			list[i]=1;
		}
	}
	
	public static void printList(int[] list){
		for(int i=0; i<list.length; i++){
			System.out.print(list[i]+" ");
		}
	}
	
	public static void main(String[] args){
		int[] list = {1,1,0,0,0,1,0,0,1,0};
		System.out.println("Before Sorting");
		printList(list);
		System.out.println();
		System.out.println("After Sorting using while loop");
		sortArray(list);
		printList(list);
		System.out.println();
		System.out.println("After Sorting using count");
		sortArrayUsingCount(list);
		printList(list);


	}

}
