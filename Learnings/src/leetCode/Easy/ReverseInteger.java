package leetCode.Easy;

/*
 * Ref : https://www.youtube.com/watch?v=j3VMLDg7Tp4 , https://www.geeksforgeeks.org/reverse-digits-integer-overflow-handled/
 * 
 * https://leetcode.com/problems/reverse-integer/solution/
 * 
 * Time Complexity: O(log(x))
 * Space : O(1)
 */

public class ReverseInteger {
	
	public static int reverseInt(int num) {
		boolean negative = false;
		
		if(num < 0) {
			negative = true;	
			num = -num;
		}
		
		long rev = 0;	// To avoid overflow, take the rev as long
		
		while(num > 0) {
			int rem = num%10;
			rev = (rev*10) + rem;
			num = num/10;
		}
		
		if(rev > Integer.MAX_VALUE) {
			return 0;
		}
		return (int) (negative ? -rev:rev);
		// Below code is substitue of above ternary statement
		
//		if(negative) {
//			return (int) -rev;
//		}
//		return (int) rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -123;
		System.out.println(reverseInt(num));

	}

}
