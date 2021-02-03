package pepCoding.StacksQueues;

public class ExampleStack {
	
	public static class CustomStack {
		// Create an array of elements to be stored in stack.
		int[] stack;
		// Create a top element
		int top;
		
		public CustomStack(int size) {
			// Will create an array with the given size in constructor
			stack = new int[size];
			// Will initialize the top with -1 as there are no elements in stack as of now
			top = -1;
		}
		
		// Push function for normal stack
		public void push(int data) {
			// If array is full
			if(top == stack.length-1) {
				System.out.println("Stack overflow");
			}
			// Increase the top and store the value at that top index
			top++;
			stack[top] = data;
		}
		
		// Push function for dynamic stack where stack overflow condition will not come and stack will double its size when the size is full like arraylist. Its known as dynamic stack. All function remain same here except push().														
		public void dynamicStackPush(int data) {
			if(top == stack.length-1) {
				// Create a new stack of double size than the previous stack
				int[] newStack = new int[2*(stack.length)];
				// Copy all the data from previous stack to new stack
				for(int i=0; i<stack.length; i++) {
					newStack[i] = stack[i];
				}
				// Refer the new stack for operations now
				stack = newStack;
				top++;
				stack[top]=data;
			} else {
				// Here when the stack is not full then add in the existing stack only.
				top++;
				stack[top] = data;
			}
		}
			
		public int pop() {
			if(top == -1) {
				System.out.println("Stack underflow");
				return -1;
			}
			int data = stack[top];
			top--;
			return data;
		}
		
		public int peek() {
			if(top == -1) {
				System.out.println("Stack underflow");
				return -1;
			}
			int data = stack[top];
			return data;
		}
		
		public int size() {
			return top+1;
		}
		
		public void display() {
			for(int i=top; i>=0; i--) {
				System.out.print(stack[i]+" , ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		CustomStack s1 = new CustomStack(4);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		System.out.println("Stack size is => "+s1.size());
		s1.display();
		s1.dynamicStackPush(50);
		System.out.println("Stack size is => "+s1.size()+" using dynamic stack push() as stack is defined of 4 elements initially");
		s1.display();
		System.out.println("Stack peek is => "+s1.peek());
		System.out.println("Stack pop is => "+s1.pop());
	}	
}
