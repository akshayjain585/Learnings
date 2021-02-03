package pepCoding.FunctionsArrays;

/*
 * Problem : Reverse an array so that when we print it from o till length, array data is reversed. Don't print from last to print in reverse. In actual, reverse the array data.
 */

public class ReverseAnArray {
	
	public static void reverseArrayData(int[] list) {
		int startIndex = 0;
		int endIndex = list.length-1;
		
		while(startIndex < endIndex) {
			int temp = list[startIndex];
			list[startIndex] = list[endIndex];
			list[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}
	
	public static void printArray(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {1,2,3,4,5,6,7};
		printArray(list);
		reverseArrayData(list);
		printArray(list);
	}

}
