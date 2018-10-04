//The time complexity of Binary Search is 0(Logn)

package searching;

public class BinarySearchUsingRecursion {
	
	public static int binarySearchRecursion(int[] list, int start, int end, int key){
		
		if(end>=1){
			int mid = (start+end)/2;        //Use mid = start + (end - start)/2; to avoid overflow
			if(list[mid]==key){
				return mid;
			}if(list[mid]<key){
				return binarySearchRecursion(list,mid+1,end,key);
			}else{
				return binarySearchRecursion(list,start,mid-1,key);
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
		int n= array.length -1 ;
		int result= binarySearchRecursion(array, 0, n, 2);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Element found at index: "+result);
		}

	}

}
