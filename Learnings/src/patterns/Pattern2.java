/*
 
 * * * * *
 *       * 
 *       *
 *       *
 * * * * *
 
 */


package patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		
		for(i=0;i<5;i++){
			
			for(j=0;j<5;j++){
				
				if(i==0||i==4||j==0||j==4){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
