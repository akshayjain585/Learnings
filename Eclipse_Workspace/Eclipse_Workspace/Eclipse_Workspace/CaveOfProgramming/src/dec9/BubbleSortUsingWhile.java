package dec9;

public class BubbleSortUsingWhile {

	public static void main(String[] args) {

		int numbers[] = {20,12,8,6,3,14} ;
		
		BubbleSort(numbers);
		printingArray(numbers);
		
	}
	
	public static int[] BubbleSort(int[] num){
		int temp ;
		boolean fixed = false ;
		
		while(fixed==false){
			
			fixed = true ;
			
			for(int i=0; i<num.length-1; i++){
				
				if(num[i] > num[i+1]){
					
					temp = num[i+1];
					num[i+1] = num[i];
					num[i] = temp;
					fixed = false;
				}
			}
		}
		return num;	
	}
	
	
	public static int[] printingArray(int[] num){
		
		for(int i=0 ; i<num.length; i++){
			System.out.println(num[i]);	
		}
		return num;
	}
}
