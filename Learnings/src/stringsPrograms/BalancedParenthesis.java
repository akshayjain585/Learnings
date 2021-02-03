package stringsPrograms;

public class BalancedParenthesis {

	static class Stack{

		static final int max=100;
		static char[] stack = new char[max];
		static int top = -1;

		public static void push(char ch){
			if(top>=(max-1)){
				return;
			}
			top++;
			stack[top]=ch;
		}

		public static char pop(){
			if(top<0){
				return '\0';
			}
			char ch = stack[top];
			top--;
			return ch;
		}

		public static boolean isEmpty(){
			if(top<0){
				return true;
			}
			return false;
		}

		public static char peek(){
			if(top<0){
				return '\0';
			}
			char ch = stack[top];
			return ch;
		}

	}

	public static boolean isBalancedP(String input1){

		for(int i=0; i<input1.length(); i++){
			char ch = input1.charAt(i);
			if(ch=='(' || ch=='{' || ch=='['){
				Stack.push(input1.charAt(i));
			}
			if(ch==')' || ch=='}' || ch==']'){
				if(Stack.isEmpty()){
					System.out.println("Unbalanced Parenthesis");
					return false;
				}else{
					char last = Stack.peek();
					if(last=='(' && ch==')' || last=='{' && ch=='}' || last=='[' && ch==']'){
						Stack.pop();
					}else{
						System.out.println("Unbalanced Parenthesis");
						return false;

					}
				}
			}
		}
		if(Stack.isEmpty()){
			System.out.println("Balanced Parenthesis");
			return true;
		}else{
			System.out.println("Unbalanced Parenthesis");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "[()]{}{[()()]()}";
		String input2 = "[(]){}}]";
		String input3 = "[(]){{}}[]";
		String input4 = "((()})";

		isBalancedP(input1);
		isBalancedP(input2);
		isBalancedP(input4);


	}

}
