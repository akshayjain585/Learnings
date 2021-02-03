package pepCoding.FunctionsArrays;

import java.util.Arrays;

/*
 * Problem : To rotate an array with no extra space and least time complexity. Given an array and integer value to describe number of times to rotate.
 * Example :
 * roatateBy = -1	: b, c, d, e, f, a : The result of this is similar to rotateBy 5 which means for any negative values "rotateBy = rotateBy + list.length" (-1 + 6 = 5)
 * rotateBy = 0		: a, b, c, d, e, f
 * rotateBy = 1		: f, a, b, c, d, e
 * rotateBy = 2		: e, f, a, b, c, d
 * rotateBy = 5		: b, c, d, e, f, a
 * 
 * Trick:
 * For negative values like -1,-2,-3 etc : rotateBy = rotateBy + list.length;  (-1 + 6 = 5)
 * For larger values like 109,117 etc : rotateBy = rotateBy % list.length : This will give the remainder as in case of 109, 109 % 6 = 1, thus we should rotate only by 1 
 * 
 * Approach:
 * 1. Make a partition P1, P2 (rotate By) Ex: Rotate by is 2, List : a, b, c, d, e, f (P1 = a,b,c,d)	(P2 = e,f)
 * 2. reverse P1, reverse P2 : (P1 = d,c,b,a)	(P2 = f,e)
 * 3. reverse entire array 	 : e,f,a,b,c,d : And thats the result
 * 
 */

public class RotateAnArray {
	
	public static void reverse(int[] list, int sIdx, int eIdx) {
		while(sIdx < eIdx) {
			int temp = list[sIdx];
			list[sIdx] = list[eIdx];
			list[eIdx] = temp;
			sIdx++;
			eIdx--;
		}
	}
	
	// Optimised Approach
	public static void rotateAnArray(int[] list, int rotateBy) {
		// To handle large value of rotate for optimising the rotateBy value.
		rotateBy = rotateBy % list.length;
		
		if(rotateBy < 0) {
			rotateBy = rotateBy + list.length;
		}
		
		// Part 1 : Reverse partition 1
		reverse(list, 0, list.length-rotateBy-1);
		// Part 2 : Reverse partition 2
		reverse(list, list.length-rotateBy, list.length-1);
		// Part 3 : Reverse the entire array
		reverse(list, 0, list.length-1);
	}
	
	// Normal approach
	public static void arrayRotationToLeft(int[] list, int n){

		System.out.print(Arrays.toString(list));

		for(int i=0; i<n; i++){
			int temp = list[0];
			for(int j=0; j<list.length-1; j++){
				list[j]=list[j+1];
			}
			list[list.length-1]=temp;
		}
		
		System.out.println();
		System.out.print(Arrays.toString(list));
	}
	
	// Normal approach
	public static void arrayRotationToRight(int[] list, int n){
		
		System.out.print(Arrays.toString(list));
		
		for(int i=0; i<n; i++){
			int temp = list[list.length-1];
			for(int j=list.length-1; j>0; j--){
				list[j] = list[j-1];
			}
			list[0]=temp;
		}
		System.out.println();
		System.out.print(Arrays.toString(list));
	}
	
	public static void printArray(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" , ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] list = {10,20,30,40,50,60};
		int rotateBy = 3;
		printArray(list);
		rotateAnArray(list,rotateBy);
		printArray(list);
	}

}
