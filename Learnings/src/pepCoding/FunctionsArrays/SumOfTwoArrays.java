package pepCoding.FunctionsArrays;

public class SumOfTwoArrays {
	
	public static void sumArray(int[] list1, int[] list2) {
//		int[] res = new int[list1.length > list2.length ? list1.length : list2.length];
		
		int[] res;
		
		if(list1.length > list2.length) {
			res = new int[list1.length];
		} else {
			res = new int[list2.length];
		}
		
		int i = list1.length -1;
		int j = list2.length -1;
		int k = res.length -1;
		int carry = 0;
		
		while(k>=0) {
			int sum = carry;
			
			if(i>=0) {
				sum = sum + list1[i];
			}
			
			if(j>=0) {
				sum = sum + list2[j];
			}
			
			carry = sum/10;
			sum = sum%10;
			res[k]=sum;
			i--;
			j--;
			k--;
		}
		
		if(carry>0) {
			System.out.print(carry);
		}
		
		for(int val : res) {
			System.out.print(val);
		}
	}
	
	public static void main(String[] args) {
		int[] list1 = {9,9,9,9,9,9};
		int[] list2 = {1};
		
		sumArray(list1,list2);
		
	}

}
