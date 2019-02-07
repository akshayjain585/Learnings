package arraysPrograms;

public class ArrayRotationNinetyDegree {

	public static void rotationNinetyDegree(int[][] list, int m, int n){
		int fRow = 0;
		int lRow = m-1;
		int fCol = 0;
		int lCol = n-1;

		while(lCol>=0){			
			for(int i=fRow; i<=lRow; i++){
				System.out.print(list[i][lCol]+"  ");
			}
			System.out.println();
			lCol--;
		}
	}

	public static void print2DArray(int[][] list){

		for(int i=0; i<list.length; i++){
			for(int j=0; j<list.length; j++){
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}

	}

	public static void printFromFirstCol(int[][] list, int m, int n){
		int fRow = 0;
		int lRow = m-1;
		int fCol = 0;
		int lCol = n-1;

		while(fCol<=lCol){
			for(int i=fRow; i<=lRow; i++){
				System.out.print(list[i][fCol]+"  ");
			}
			System.out.println();
			fCol++;
		}
	}

	public static void main(String[] args) {
		int[][] list = new int[4][4];
		list[0][0] = 2;
		list[0][1] = 3;
		list[0][2] = 4;
		list[0][3] = 5;

		list[1][0] = 6;
		list[1][1] = 7;
		list[1][2] = 8;
		list[1][3] = 9;

		list[2][0] = 10;
		list[2][1] = 11;
		list[2][2] = 12;
		list[2][3] = 13;

		list[3][0] = 14;
		list[3][1] = 15;
		list[3][2] = 16;
		list[3][3] = 17;

		print2DArray(list);
		System.out.println("*******************");
		rotationNinetyDegree(list,4,4);
		System.out.println("*******************");
		printFromFirstCol(list,4,4);
		
	}

}
