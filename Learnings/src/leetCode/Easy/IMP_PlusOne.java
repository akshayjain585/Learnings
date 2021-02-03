package leetCode.Easy;

/*
 * Ref: https://leetcode.com/problems/plus-one/submissions/
 */

public class IMP_PlusOne {
	
    public static int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }else{
                digits[i]++;
                return digits;
            }
        }
        
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    
    public static void main(String[] args) {
    	int[] list = {9,9,9,9};
    	int[] res = plusOne(list);
    	for(int i=0; i<res.length; i++) {
        	System.out.print(res[i]+" , ");
    	}
    	System.out.println();
    }

}
