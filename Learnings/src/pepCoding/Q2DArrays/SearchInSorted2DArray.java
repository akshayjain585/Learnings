package pepCoding.Q2DArrays;

/*
 * Based on binary search. If element is found at last index, return. Else if element is greater, search below by increasing the row else search in same row by decreasing the column.
 */

public class SearchInSorted2DArray {
	
	public static void searchIn2DArray(int[][] list, int num) {
		int i = 0;
		int j = list[0].length-1;
		
		// As i which is row will move down and j which is col will move back if element is not found as i is set at starting and j is set at last
		while(i<list.length && j>=0) {
			if(num == list[i][j]) {
				System.out.println(i+" , "+j);
				return;
			}else if(num > list[i][j]) {	// This means number is present in next rows as the matrix is sorted.
				i++;	// Increment the row
			}else {
				j--;	//Decrement the col means the number is present in same row on left.
			}			
		}
		System.out.println("Input not found");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] list = new int[4][4];
		list[0][0] = 11;
		list[0][1] = 12;
		list[0][2] = 13;
		list[0][3] = 14;

		list[1][0] = 21;
		list[1][1] = 22;
		list[1][2] = 23;
		list[1][3] = 24;

		list[2][0] = 31;
		list[2][1] = 32;
		list[2][2] = 33;
		list[2][3] = 34;

		list[3][0] = 41;
		list[3][1] = 42;
		list[3][2] = 43;
		list[3][3] = 44;


		for(int i=0; i<4; i++){
			for(int j=0; j<4; j++){
				System.out.print(list[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("****************");
		
		int numToFind = 32;
		searchIn2DArray(list,numToFind);

	}
}
