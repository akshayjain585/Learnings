package pepCoding.FunctionsArrays;

/*
 * Problem : Inverse an array means replace index of an array with its values in new array
 * Ex : {3, 4, 1, 2, 0, 5}
 * i = 0, val = 3
 * In new array {4 , 2 , 3 , 0 , 1 , 5}
 * i = 3, val = 0
 */

public class InverseOfAnArray {
	
	public static int[] inverseArray(int[] list) {
		int[] inverse = new int[list.length];
		for(int i=0; i<list.length; i++) {
			int val = list[i];
			inverse[val]=i;
		}
		return inverse;
	}
	
	public static boolean mirrorInverse(int[] list) {
		for(int i=0; i<list.length; i++) {
			if(list[list[i]] != i) {
				return false;
			}
		}
		return true;
	}
	
	public static void printArray(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" , ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] list = {3,4,1,2,0,5};
		printArray(list);
		int[] inv = inverseArray(list);
		printArray(inv);
		int[] list1 = {3,4,2,0,1};
		System.out.println(mirrorInverse(list1));
	}

}
