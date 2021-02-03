package pepCoding.StacksQueues;

import java.util.Stack;

/*
 * Problem : 
 * Approach : We need to take care of only opening/closing brackets and no other characters
 * 1. Any opening brackets : push()
 * 2. Any closing brackets : Check if the stack is not empty and the closing bracket has its counter part or not. Ex: this '(' for ')', this '{' for '}'.
 *    If counter part is not available or stack is empty return false saying its not balanced brackets.
 */


// Follow balanced paranthesis program written in Strings as this will fail for String input5 below as it returns true earlier.
public class BalancedBrackets {
	
	public static boolean balancedBrackets(String input) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if(ch == ')') {
				return handleClosingBracket(st,'(');
			} else if(ch == '}') {
				return handleClosingBracket(st,'{');
			} else if(ch == ']') {
				return handleClosingBracket(st,'[');
			}
		}
		
		// In the end if the stack size is 0 then all over, balanced paranthesis.
		if(st.size() == 0) {
			return true;
		}
		// It means some opening brackets left out so not balanced.
		return false;
	}
	
	// correspondingClosingBracket = cbh
	// Helper function to handle when close bracket of any type comes.
	public static boolean handleClosingBracket1(Stack<Character> stack, char cbh) {
		// If size is 0 that means only closing bracket is left out. So not balanced.
		if(stack.size() == 0) {
			return false;
		// If it doesn't match with the corresponding opening bracket then not balanced.	
		} else if(stack.peek() != cbh) {
			return false;
		} else {
		// if matches then pop.	
			stack.pop();
		}
		return true;
	}
	
	// Another way of using the helper method.
	public static boolean handleClosingBracket(Stack<Character> stack, char cbh) {
		// If size is 0 that means only closing bracket is left out. So not balanced.
		if(stack.size() == 0) {
			return false;
		// If it doesn't match with the corresponding opening bracket then not balanced.	
		} else if(stack.peek() == cbh) {
			stack.pop();
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String input1 = "[()]{}{[()()]()}";
		String input2 = "[(]){}}]";
		String input3 = "[(]){{}}[]";
		String input4 = "(){}}{";
		
//		String input5 = "[()";
		
		System.out.println(balancedBrackets(input1));
		System.out.println(balancedBrackets(input2));
		System.out.println(balancedBrackets(input3));
		System.out.println(balancedBrackets(input4));

	}

}
