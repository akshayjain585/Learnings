package pepCoding.StacksQueues;

/*
 * Problem : To find if a string contains extra brackets. Ex : (a+b) is fine. But if string is ((a+b)): Here a+b is enclosed twice.
 * Approach : 
 * 1. Run a loop and take each character using charAt() function.
 * 2. If the character is anything except closing bracket, keep pushing to stack using push() method.
 * 3. If you get closing bracket ')', pop the elements till you find opening bracket '('. Catch here is that there should be some pop of elements before you get opening bracket.
 * 	  If you directly get the opening bracket after closing bracket then that means, there was nothing inside it and its duplicate bracket. And should return as true.
 */

import java.util.Stack;

public class DuplicateBrackets {
	
	public static boolean duplicateBrackets(String input) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			// If the character is closing bracket
			if(ch == ')') {
				// Peek and check if the element is opening bracket and if its, then return true as that means there was nothing inside the bracket.
				if(st.peek() == '(') {
					return true;
				} else {
					// Pop the elements until you find opening bracket.
					while(st.peek() != '(') {
						// This pop will pop the middle element between closing and opening bracket.
						st.pop();
					}
					// This pop is to pop the opening bracket as well.
					st.pop();
				}
			} else {
				st.push(ch);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String input = "((a+b) + (a+b))";
		String input1 = "(a+b)+((a+b))";
		System.out.println("Duplicate brackets : "+duplicateBrackets(input));
		System.out.println("Duplicate brackets : "+duplicateBrackets(input1));
	}

}
