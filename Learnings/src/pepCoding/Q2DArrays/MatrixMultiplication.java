package pepCoding.Q2DArrays;

import java.util.Scanner;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		
		int[][] list1 = new int[r1][c1];
		
		for(int i=0; i<list1.length; i++) {
			for(int j=0; j<list1[0].length; j++) {
				list1[i][j] = scan.nextInt();
			}
		}
		
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();
		
		int[][] list2 = new int[r2][c2];
		
		for(int i=0; i<list2.length; i++) {
			for(int j=0; j<list2[0].length; j++) {
				list1[i][j] = scan.nextInt();
			}
		}
		
		// Here the code starts for multiplication
		// Column of first array should be equal to row of second array for multiplication
		if(c1 != r2) {
			System.out.println("Invalid Input");
			return;
		}
		
		int[][] prod = new int[r1][c2];
		
		for(int i=0; i<prod.length; i++) {
			for(int j=0; j<prod[0].length; j++) {
				for(int k=0; k<c1; k++) {
					prod[i][j] = prod[i][j] + list1[i][k] * list2[k][j];
				}
			}
		}
		
		for(int i=0; i<prod.length; i++) {
			for(int j=0; j<prod[0].length; j++) {
				System.out.print(prod[i][j]+"  ");
			}
			System.out.println();
		}				
	}

}
