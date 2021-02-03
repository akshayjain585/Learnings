package leetCode.Easy;

/*
 * Ref : https://leetcode.com/problems/power-of-two/
 */

public class PowerOfTwo {
	
    public static boolean isPowerOfTwo(int n) {
        
  if (n == 0) {
      return false;
  }
    while (n % 2 == 0){
        n = n/2;
    } 
    return n == 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 16;
		int n2 = 218;
		
		System.out.println(isPowerOfTwo(n1));
		System.out.println(isPowerOfTwo(n2));

	}

}
