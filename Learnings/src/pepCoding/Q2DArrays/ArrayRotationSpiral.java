/*		l			r
 * 	t	2	3	4	5			dir = 0  left to right
 * 		6	7	8	9			dir = 1  right to bottom
 * 		10	11	12	13			dir = 2 bottom to left
 * 	b	14	15	16	17			dir = 3 bottom to top
 * 		
 */

package pepCoding.Q2DArrays;

public class ArrayRotationSpiral {

	public static void arrayRot(int m, int n, int[][] list ){
		int t=0; int b = m-1; int l=0 ; int r = n-1;  
		
		//t = top row index, b = bottom row index, l = first column index, r = last column index
		//m = no. of rows, n = no. of columns

		int dir =0;
		while(t<=b && l<=r){
			if(dir==0){
				for(int i=l; i<=r; i++){		//Traverse L to R and increment t row since thats printed now
					System.out.print(list[t][i]+"  ");
				}
				System.out.print(" , ");
				t++;
				dir=1;
			}else if(dir==1){
				for(int i=t; i<=b; i++){		//Traverse T to B and decrement r column since thats printed now
					System.out.print(list[i][r]+"  ");
				}
				System.out.print(" , ");
				r--;
				dir=2;
			}else if(dir==2){
				for(int i=r; i>=l; i--){		//Traverse R to L and decrement B row since thats printed now
					System.out.print(list[b][i]+"  ");
				}
				System.out.print(" , ");
				b--;
				dir=3;
			}
			else if(dir ==3){
				for(int i=b; i>=t; i--){		//Traverse B to T and increment L column since thats printed now
					System.out.print(list[i][l]+"  ");
				}
				System.out.print(" , ");
				l++;
				dir=0;
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		arrayRot(4, 4, list);
		

	}

}
