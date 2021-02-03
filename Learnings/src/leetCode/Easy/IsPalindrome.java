package leetCode.Easy;

/*
 * https://leetcode.com/problems/palindrome-number/submissions/
 * Time : O(log(n))
 * Space : O(1)
 */

public class IsPalindrome {
	
    public static boolean isPalindrome(int x) {
        
        if(x < 0){
            return false;
        }       
        int rev = 0;
        int actualNum = x;
        while(x > 0){
            int rem = x % 10;
            rev = (rev*10) + rem;
            x = x/10;
        }
        if(rev == actualNum){
            return true;
        }
        return false;
    }
    
    // Ref : https://leetcode.com/problems/valid-palindrome/submissions/
    // Time : O(n), Space : O(1)
    public static boolean isPalindromeString(String s) {
     
    	s = s.toLowerCase();
    	int leftIndex = 0;
    	int rightIndex = s.length()-1;
    	
    	while(leftIndex <= rightIndex) {
    		char charAtLeft = s.charAt(leftIndex);
    		char charAtRight = s.charAt(rightIndex);
    		
    		if(!Character.isLetterOrDigit(charAtLeft)) {
    			leftIndex ++;
    		}else if(!Character.isLetterOrDigit(charAtRight)) {
    			rightIndex --;
    		}else if(charAtLeft != charAtRight) {
    			return false;
    		}else {
    			leftIndex ++;
    			rightIndex --;
    		}
    	}
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		System.out.println(isPalindrome(num));
		String input1 = "A man, a plan, a canal: Panama";
		String input2 = "race a car";
		System.out.println(isPalindromeString(input1));
		System.out.println(isPalindromeString(input2));
	}

}
