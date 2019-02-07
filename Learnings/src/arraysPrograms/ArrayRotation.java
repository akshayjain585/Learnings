package arraysPrograms;

import java.util.Arrays;

public class ArrayRotation {

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
	
	public static void main(String[] args) {
		
		int[] list = new int[] {2,3,7,8,9,10,11,12};
		int rotateBy = 3;
		
		arrayRotationToLeft(list,rotateBy);
		System.out.println();
		arrayRotationToRight(list,rotateBy);
		
	}

}
