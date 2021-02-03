package pepCoding.Q2DArrays;

/*
 * Problem : Display wave. Means first column top to bottom, then second colum bottom to top and so n forth.
 * Trick : 1. Column changes everytime while printing from top to bottom and then bottom to top.
 * 2. Row increase from top to bottom and row decreases from bottom to top.
 * 
 * Problem : ZigZag (Same approach like above)
 * 
 * In Wave, the column moves and in zigzag the row moves.
 */

public class WaveZigZagRotateBy90Traversal {
	
	public static void displayWave(int[][] list) {
		for(int j=0; j<list[0].length; j++) {
			if(j%2 == 0) {
				for(int i=0; i<list.length; i++) {
					System.out.print(list[i][j]+"  ");
				}
				System.out.println();
			}else {
				for(int i=list.length-1; i>=0; i--) {
					System.out.print(list[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}
	
	public static void zigZag(int[][] list) {
		for(int i=0; i<list.length; i++) {
			if(i%2==0) {
				for(int j=0; j<list[0].length; j++) {
					System.out.print(list[i][j]+"  ");
				}
				System.out.println();
			}else {
				for(int j=list[0].length-1; j>=0; j--) {
					System.out.print(list[i][j]+"  ");
				}
				System.out.println();
			}
		}
	}
	
	public static void rotateBy90(int[][] list) {
		for(int j=0; j<list[0].length; j++) {
			for(int i=list.length-1; i>=0; i--) {
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static void diagonalTraversal(int[][] list) {
		for(int g=0; g<list.length; g++) {
			for(int i=0, j=g; j<list.length; i++,j++) {
					System.out.print(list[i][j]+"  ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list = new int[4][4];
		list[0][0] = 1;
		list[0][1] = 2;
		list[0][2] = 3;
		list[0][3] = 4;

		list[1][0] = 5;
		list[1][1] = 6;
		list[1][2] = 7;
		list[1][3] = 8;

		list[2][0] = 1;
		list[2][1] = 3;
		list[2][2] = 5;
		list[2][3] = 7;

		list[3][0] = 2;
		list[3][1] = 4;
		list[3][2] = 6;
		list[3][3] = 8;
		

		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("****************");
		
		displayWave(list);
		System.out.println("****************");
		zigZag(list);
		System.out.println("****************");
		rotateBy90(list);
		System.out.println("****************");
		diagonalTraversal(list);
	}

}	


