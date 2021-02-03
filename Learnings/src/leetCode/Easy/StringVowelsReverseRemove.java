package leetCode.Easy;

import java.util.Arrays;

public class StringVowelsReverseRemove {
	
	// Reverse the string
    public static char[] reverseString(char[] s) {
        if(s.length <= 1){
            return s;
        }
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
        return s;
    }
    
    // Reverse the vowels in a string
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        
        int start = 0;
        int end = ch.length-1;
        while(start < end){
            if(isVowel(ch[start]) && isVowel(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start ++;
                end --;
            }else if(isVowel(ch[start])){
                end --;
            }else{
                start ++;
            }
        }
//        return Arrays.toString(ch);	// Presents the array in string representation in array itself. Doesn't convert the array to string.
            return new String(ch);
    }
    
    // Helper function for above method.
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    
    // Remove the vowels in a string
    public static String removeVowels(String input) {
    	
    	StringBuilder sb = new StringBuilder(input);
    	System.out.println(sb);
    	
    	for(int i=0; i<sb.length(); i++) {
    		if(isVowel(sb.charAt(i))) {
    			sb.deleteCharAt(i);
    			i--;			// Decremented i by 1 because when you delete the char from stringBuilder, the length also gets reduced and the immediate next character also could be vowel which will not be checked if we don't decrement i. Ex: eelo : e gets removed first, so sb becomes "elo" and index will be at 1 position now so 'e' will not be checked.							
    		}
    	}
    	return sb.toString();
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'h','e','l','l','o'};
		System.out.println(reverseString(ch));
		
		String input = "leetcodeisacommunityforcoders";
		System.out.println(reverseVowels(input));
		System.out.println(removeVowels(input));

	}

}
