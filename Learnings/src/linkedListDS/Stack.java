package linkedListDS;

/*
 * Operations: (LIFO)
 * 1. Push : To add element in stack
 * 2. Pop : To remove element from stack
 * 3. Peek or Top : To return the top element from stack
 * 4. isEmpty : To check if the stack is empty or not.
 */

public class Stack {
	
	final int max = 10;       // Setting the maximum size of Stack
	int[] stack = new int[max];  //Creating an array as per the size of stack
	int top;     
	
	public Stack(){
		top = -1;   	//Setting the default value of top as -1 since there is no element in stack and its in underflow condition.
	}

	public void push(int data){
		
		if(top>=(max-1)){	//Since top default value is -1 and max value is 10 so 0-9 and when top==9. Its overflow;
			System.out.println("Stack Overflow");
		}else{
			top++;   //Since the top value was -1 set from constructor, so increment the value of top to 0 and store the value.
			stack[top] = data;
		}
	}
	
	public int pop(){
		if(top<0){
			System.out.println("Stack Underflow");
			return -1;
		}else{
			int data = stack[top];
			top--;
			return data;
		}
	}
	
	public int peek(){
		if(top>=0){
			return stack[top];
		}
		System.out.print("Stack Underflow ");
		return -1;
	}
	
	public boolean isEmpty(){
		if(top<0){
			return true;
		}
		return false;
	}
	
	public void show(){
		for(int n : stack){
			System.out.print(n +" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println(s.isEmpty());  // True
		System.out.println(s.peek()); 	//Stack Underflow -1
		s.push(10);
		s.push(1);
		s.push(34);
		s.push(3);
		s.show();  //Printing the stack
		System.out.println();
		System.out.println(s.pop());
		s.show();
		
		
		
		
	}

}
