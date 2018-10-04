package dec9;

public class FirstSecondThirdSmallest {

	public static void main(String[] args) {

		int[] arr = {50, 20, 40, 90, 10} ;
		
		int FirstSmallest = arr[0] ;
		int SecondSmallest = arr[0] ;
		int ThirdSmallest = arr[0] ;
		
		for(int i=1 ; i<arr.length ; i++){
			
			if(arr[i] < FirstSmallest){
				
				FirstSmallest = arr[i] ;
			}
		}
				
		for(int j=1 ; j<arr.length; j++){
			
			if(arr[j] < SecondSmallest && FirstSmallest < arr[j]){
				
				SecondSmallest = arr[j] ;
			}
		}
				
		for(int k=1; k<arr.length; k++){
			
			if(arr[k] < ThirdSmallest && SecondSmallest < arr[k]){
				
				ThirdSmallest = arr[k] ;
			}
		}
		
		System.out.println("The FirstLargest number is " +FirstSmallest);

		System.out.println("The SecondLargest number is " +SecondSmallest);

		System.out.println("The ThirdLargest number is " +ThirdSmallest);
	}

}
