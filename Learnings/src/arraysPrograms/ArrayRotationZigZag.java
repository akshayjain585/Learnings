package arraysPrograms;

public class ArrayRotationZigZag {
	
	public static void arrayRotationZigZag(int[][] list, int m, int n){
		int fRow = 0;
		int lRow = m-1;
		int fCol = 0;
		int lCol = n-1;
		int dir = 0;
		
		while(fRow<=lRow){
			if(dir%2==0){
				for(int i=fCol; i<=lCol; i++){
					System.out.print(list[fRow][i]+"  ");
				}
				fRow++;
				dir++;
				System.out.println();
			}else{
				for(int i=lCol; i>=fCol; i--){
					System.out.print(list[fRow][i]+"  ");
				}
				fRow++;
				dir++;
				System.out.println();
			}
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
		System.out.println("***********************");
		arrayRotationZigZag(list,4,4);
		
	}

}
