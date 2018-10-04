package dec9;

public class SumOfElementsArray {

	public static void main(String[] args) {

		int[] array = {10,40,20,30} ;
		
		int sum = 0 ;
		int mul = 1;
		
		for(int i=0; i<array.length ; i++){
			
			sum += array[i];
			mul *= array[i];
		}
		
		System.out.println("The sum of the elements of the array is " +sum);
		System.out.println("The multiplication of the elements of the array is " +mul);

	}

}
