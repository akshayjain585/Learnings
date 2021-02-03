package pepCoding.StacksQueues;

/*
 * Problem Statement : Implement a queue using stack with constant time complexity for add() function and linear complexity for remove and peek. So, if we somehow manage to do remove() and peek() from stack like queue so that the first element comes out first. We will implement queue using stack.
 * Approach:
 * 1. Take 2 stack
 * 2. For any removal/retrieval of data, store all elements from s1 to s2 till s1 size is equal to 1 so that we can store the last element. Then store that as well to s2. Now, store all elements back to s1 and return the last element for peek and remove the last element for pop.
 *  
 *  HINT : Approach for QueuetoStackPUSH efficient and StackToQueueADD efficient is completely similar.
 */

import java.util.Stack;

public class StackToQueueAddEfficient {
	
	public static class StackToQueueAdd {
		
		Stack<Integer> mainStack;
		Stack<Integer> helperStack;
		
		public StackToQueueAdd() {
			mainStack = new Stack<>();
			helperStack = new Stack<>();
		}
		
		public int size() {
			return mainStack.size();
		}
		
		// Constant time complexity which is O(1)
		public void add(int data) {
			mainStack.push(data);
		}
		
		// Linear time complexity
		public int remove() {
			if(size() == 0) {
				System.out.println("Queue Underflow");
				return -1;
			} else {
				while(mainStack.size() > 1) {
					helperStack.push(mainStack.pop());
				}
				int data = mainStack.pop();
				while(helperStack.size() > 0) {
					mainStack.push(helperStack.pop());
				}
				return data;
			}
		}
		
		// Linear time complexity
		public int peek() {
			if(size() == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				while(mainStack.size() > 1) {
					helperStack.push(mainStack.pop());
				}
				int data = mainStack.pop();
				helperStack.push(data);
				while(helperStack.size() > 0) {
					mainStack.push(helperStack.pop());
				}
				return data;
			}
		}
	}

}
