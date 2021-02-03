package pepCoding.FunctionsArrays;

import java.util.Arrays;
import java.util.List;

/*
 * Problem : Subarray for {1,2,3}
 * Sol :		
 * 	1
 *  1 2
 *  1 2 3
 *  2
 *  2 3
 *  3
 * 
 */

public class SubArray {
	
	public static void subArray(int[] list) {
		
		// Pick starting point 
		for(int i=0; i<list.length; i++) {
			
			// Pick ending point
			for(int j=i; j<list.length; j++) {
				
				// Print subarray between current starting and ending points 
				for(int k=i; k<=j; k++) {
					System.out.print(list[k]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void subList(List<Integer> list) {
		for(int i=0; i<list.size(); i++) {
			for(int j=i; j<list.size(); j++) {
				System.out.println(list.subList(i, j+1));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] list = {1,2,3};
		subArray(list);
		List<Integer> asList = Arrays.asList(1,2,3);
		System.out.println("**************************");
		subList(asList);
	}

}
