package searching;

public class FirstLastOccurrenceInSortedList {

	public static int firstOccurrenceBS(int[] list, int key){
		int start = 0;
		int end = list.length-1;
		int result = -1;   //Return -1 if we don't find element in an array
		while(start<=end){
			int mid = (start+end)/2;
			if(key == list[mid]){
				result = mid; //Store the first occurrence of an element in an array rather than returning mid index
				end = mid-1; //To continue searching for other occurrence on left side means first occurrence since we are decrementing the value of end.
				//start = mid+1; //To continue searching for other occurrence on right side means last occurrence since we are incrementing the value of start.
			}else if(key < list[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}

		return result;
	}

	public static int lastOccurrenceBS(int[] list, int key){
		int start = 0;
		int end = list.length-1;
		int result = -1;   //Return -1 if we don't find element in an array
		while(start<=end){
			int mid = (start+end)/2;
			if(key == list[mid]){
				result = mid; //Store the first occurrence of an element in an array rather than returning mid index
				//end = mid-1; //To continue searching for other occurrence on left side means first occurrence since we are decrementing the value of end.
				start = mid+1; //To continue searching for other occurrence on right side means last occurrence since we are incrementing the value of start.
			}else if(key < list[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}

		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {1,2,4,7,8,9,9,9,10,12};
		int key = 9;
		System.out.println(FirstLastOccurrenceInSortedList.firstOccurrenceBS(list, key));
	}

}
