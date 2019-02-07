/*
 * Formula for Natural numbers : n(n+1)/2;
 * Formula for series of numbers with same difference like 2,4,6,8 etc : n/2[2a + (n-1)d]
 */

package arraysPrograms;

public class MissingNumber {
	
	public static void missingN(int[] list){
		int sum =0;
		for(int i=0; i<list.length; i++){
			sum = sum + list[i];
		}
		System.out.println("The actual sum is :"+sum);
		int sum1 = 0;
		int firstValue = list[0];
		int last = list.length-1;
		int lastValue = list[last];
		for(int j=firstValue; j<=lastValue; j++){
			sum1 = sum1 + j;
		}
		System.out.println("The expected sum is :"+sum1);
		System.out.println("Missing number is :"+(sum1-sum));
	}
	
	public static void mN(int[] list){
		int n = list.length+1;
		int aS = 0;
		for(int i=0; i<list.length; i++){
			aS = aS + list[i];
		}
		System.out.println("The actual sum is :"+aS);
		int eS = n*(n+1)/2;
		System.out.println("The expected sum is :"+eS);
		System.out.println("Missing number is :"+(eS-aS));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,6,8,9,10};
		missingN(list);
		System.out.println();
		System.out.println("Other method using Formula");
		System.out.println();
		mN(list);

}
}


