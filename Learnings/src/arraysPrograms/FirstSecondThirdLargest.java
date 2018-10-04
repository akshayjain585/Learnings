package arraysPrograms;

public class FirstSecondThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {10,15,6,34,3,76};
		
		int largest = list[0];
		int secondLargest = list[0];
		int thirdLargest = list[0];
		if(list.length < 3){
			System.out.println("Invalid Input");
			return;
		}
		for(int i=1; i<list.length; i++){   //As first index is already considered as Highest
			if(list[i] > largest){
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = list[i];
			}else if(list[i] > secondLargest){
				thirdLargest = secondLargest;
				secondLargest = list[i];
			}else if(list[i] > thirdLargest){
				thirdLargest = list[i];
			}
		}
		
		System.out.println(largest + " "+ secondLargest +" " + thirdLargest );

	}

}
