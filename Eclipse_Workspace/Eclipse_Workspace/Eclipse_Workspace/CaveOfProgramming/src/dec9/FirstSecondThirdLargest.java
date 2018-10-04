package dec9;

public class FirstSecondThirdLargest {

	public static void main(String[] args) {

		int[] arr = {50, 20, 40, 90, 10} ;
		
		int FirstLargest = arr[0] ;
		int SecondLargest = arr[0] ;
		int ThirdLargest = arr[0] ;
		
		for(int i=1 ; i<arr.length ; i++){
			
			if(arr[i] > FirstLargest){
				
				FirstLargest = arr[i] ;
			}
		}
				
		for(int j=1 ; j<arr.length; j++){
			
			if(arr[j] > SecondLargest && FirstLargest > arr[j]){
				
				SecondLargest = arr[j] ;
			}
		}
				
		for(int k=1; k<arr.length; k++){
			
			if(arr[k] > ThirdLargest && SecondLargest > arr[k]){
				
				ThirdLargest = arr[k] ;
			}
		}
		
		System.out.println("The FirstLargest number is " +FirstLargest);

		System.out.println("The SecondLargest number is " +SecondLargest);

		System.out.println("The ThirdLargest number is " +ThirdLargest);
	}

}
