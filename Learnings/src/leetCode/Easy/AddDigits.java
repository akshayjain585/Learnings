package leetCode.Easy;

/*
 * https://leetcode.com/problems/add-digits/
 * 
 */

public class AddDigits {
	
	//Time : O(n), Space : O(1)
    public static int addDigits(int num) {
        
        int res = 0;
        
           while(num > 0){
            res = res + num%10;
            num = num/10;
            if(num == 0 && res > 9){
                num = res;
                res = 0;
            }
        } 
        
        return res;
    }
    
    // Time and Space : O(1)
    public static int addDigitsEfficient(int num) {
        
        if(num == 0){
            return 0;
        }else if(num % 9 == 0){
            return 9;
        }
        
        return num % 9;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 38;
		System.out.println(addDigitsEfficient(num));
	}

}
