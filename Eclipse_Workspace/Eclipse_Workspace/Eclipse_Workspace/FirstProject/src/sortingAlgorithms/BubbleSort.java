package sortingAlgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int number[] = {8,5,4,3,6} ;
		int temp ;
		boolean fixed = false ;
				
		while(fixed==false){
			fixed = true ;
		
		for (int i=0 ; i<number.length-1 ; i++) {
			
			if(number[i] > number[i+1]){
				
				temp = number[i+1];
				number[i+1]=number[i];
				number[i]=temp;
				fixed = false ;
			}
		}
		
		for (int i=0 ; i<number.length ; i++){
			
			System.out.println(number[i]);
	}

}
	}
}
