package dec9;

public class SumMultiUsingFunctionsOfArrayElements {

	public static void main(String[] args) {

		int[] array = {10,40,20,30} ;
	
		Sum(array);
		Mul(array);
	}	
		
		public static int Sum(int[] array){
			int sum = 0;
			for(int i=0; i<array.length ; i++){
				
				sum += array[i];
			}
			
			System.out.println("The sum of the elements of the array is " +sum);
			return sum;
		}
		
		public static int Mul(int[] array){
			int mul = 1;
			for(int i=0; i<array.length ; i++){
				
				mul *= array[i];
			}
			
			System.out.println("The multiplication of the elements of the array is " +mul);
			return mul;
		}	
}
