package arraysPrograms;

public class MaximumSequentialSum {
	
	public static void mSS(int[] list){
		int actualSum=0;
		int tempSum =0;
		for(int i=0; i<list.length; i++){
			actualSum = actualSum + list[i];
			if(tempSum<actualSum){
				tempSum = actualSum;
			}
			if(actualSum<0){
				actualSum =0;
			}
		}
		System.out.println("The largest sequential sum is "+tempSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] b = {-5, 6, 7, 1, 4, -8, 16};
        mSS(a);
        mSS(b);

	}

}
