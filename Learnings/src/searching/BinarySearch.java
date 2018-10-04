package searching;

public class BinarySearch {
	
	public static int binarySearch(int[] list, int key){
		int start = 0;
		int end = list.length -1;
		while(start<=end){
			int mid = (start+end)/2;
			if(list[mid]==key){
				return mid;
			}if(list[mid]<key){
				start = mid +1;
			}else{
				end = mid -1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {2, 4, 6, 8, 10, 12, 14, 16};
		int result = binarySearch(array,2);
		if(result==-1){
			System.out.println("Element not found");
		}else{
			System.out.println("Element found at index: "+result);
		}

	}

}