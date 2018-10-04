package caveOfProgramming;

public class ExampleArrayIntegers {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 6;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		int[] myIntArrays = {1,3,5} ;
		
		for(int i=0 ; i<myIntArrays.length; i++) {
			
			System.out.println(myIntArrays[i]);
		}
		
		for(int enhancedLoop : myIntArrays){
			System.out.println("Enhanced Loop" +" " +enhancedLoop);
		}
	}

}
