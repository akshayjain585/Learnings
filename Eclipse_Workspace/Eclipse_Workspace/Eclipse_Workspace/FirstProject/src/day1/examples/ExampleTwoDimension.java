package day1.examples;

public class ExampleTwoDimension {

	public static void main(String[] args) {
		
		
		int[][] TwoDim = new int[4][3] ;
		
		TwoDim[1][0] = 10;    //Way to assigning values into two dimensional array
		
		int temp = 10;
		
		for(int i=0 ; i<4 ; i++){
			
			for(int j=0 ; j<3 ; j++) {
				
				TwoDim[i][j] = temp ;
				temp += 10 ;
				System.out.print(TwoDim[i][j] + " ");
			}
				
				System.out.println();
		}

	}

}


