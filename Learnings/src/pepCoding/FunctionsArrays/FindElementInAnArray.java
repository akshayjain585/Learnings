package pepCoding.FunctionsArrays;

public class FindElementInAnArray {
	
	public static int findElement(int[] list, int num) {
		
		if(list.length == 0) {
			return -1;
		}
		for(int i=0; i<list.length; i++) {
			if(list[i] == num) {
				System.out.print("The element is present at index : ");
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] list = {10,20,3,7,9,12,76};
		int num = 7;
		System.out.println(findElement(list,num));
	}

}
