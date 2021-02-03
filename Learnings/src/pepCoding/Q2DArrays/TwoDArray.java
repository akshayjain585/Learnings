package pepCoding.Q2DArrays;

import java.util.Scanner;

public class TwoDArray {
	
	public static void print2DArray(int[][] list) {
		// row gives the length of the array and rowth any index gives the length of the column if you visualise it in memory heap.
		for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] list = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				list[i][j] = scan.nextInt();
			}
		}
		
		print2DArray(list);

	}

}
