package pepCoding.FunctionsArrays;

public class DiffOfTwoArrays {
	
	// Assumption is list2 is greater than list1. Thus, it should be list2-list1
	public static void diffArray(int[] list1, int[] list2) {
		
		int[] res = new int[list2.length];
		int i = list1.length-1;
		int j = list2.length-1;
		int k = res.length-1;
		int carry = 0;
		
		while(k>=0) {
			int diff = 0;
			// If the list1[i] is >= 0 then take values from list1[i], else consider 0 at all list[i] places.
			int list1Val = i>=0 ? list1[i]:0;
			
			if(list2[j] + carry >= list1Val) {
				diff = list2[j]+carry - list1Val;
				carry = 0;
			}else {
				diff = list2[j]+carry+10 - list1Val;
				carry = -1;
			}
			res[k]=diff;
			i--;
			j--;
			k--;
		}
		
		int idx=0;
		// To avoid printing 0's in starting
		while(idx < res.length) {
			if(res[idx]==0) {
				idx++;
			}else {
				break;
			}
		}
		
		while(idx<res.length) {
			System.out.print(res[idx]);
			idx++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given that the list2 is greater than list1
		int[] list1 = {1};
		int[] list2 = {1,0,0,0};
		
		diffArray(list1,list2);
		

	}

}
