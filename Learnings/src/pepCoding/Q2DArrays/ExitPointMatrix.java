package pepCoding.Q2DArrays;

/*
 * Problem : Print exit point of a matrix means wherever there is 1, take 90 degree from there
 */

public class ExitPointMatrix {
	
	public static void exitPoint(int[][] list) {
		int row = 0;
		int col = 0;
		int dir = 0; //Think like a spiral direction only with 0,1,2,3 and after that using mod operator, will get back to 0 after mod with 4.
		
		while(true) {
			dir = (dir + list[row][col]) % 4;
			if(dir == 0) {
				col++;
			}else if(dir == 1) {
				row++;
			}else if(dir == 2) {
				col --;
			}else if(dir == 3) {
				row --;
			}
			
			if(row<0) {
				row++;
				break;
			}else if(col<0) {
				col++;
				break;
			}else if(row == list.length) {
				row--;
				break;
			}else if(col == list[0].length) {
				col--;
				break;
			}
		}
		System.out.print(row+" , "+col);		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list = new int[4][4];
		list[0][0] = 0;
		list[0][1] = 0;
		list[0][2] = 1;
		list[0][3] = 0;
		
		list[1][0] = 1;
		list[1][1] = 0;
		list[1][2] = 0;
		list[1][3] = 1;
		
		list[2][0] = 0;
		list[2][1] = 0;
		list[2][2] = 0;
		list[2][3] = 1;
		
		list[3][0] = 1;
		list[3][1] = 0;
		list[3][2] = 1;
		list[3][3] = 0;
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("*******************");
		exitPoint(list);
	}
}
