package pepCoding.StacksQueues;

import java.util.Stack;

/*
 * Problem Statement : Implement a queue using stack with constant time complexity for remove and peek function and linear complexity for add. So, if we somehow manage to handle add() so that the elements gets added in reverse order. Our remove() and peek() function will be in constant time complexity.
 * Approach :
 * 1. Take 2 Stacks.
 * 2. For any addition of data, make the stack 1 empty and store all the elements in Stack2. Store the data in S1 and then remove all the elements from S2 and store in S1. 
 * With the above approach, when you do either remove() or peek(), you will get the element returned which was added initially tot behave like queue.										
 * 
 * HINT : Approach for QueuetoStackPOP efficient and StackToQueueREMOVE efficient is completely similar.
 */

public class StackToQueueRemoveEfficient {
	
	public static class StackToQueue {
		Stack<Integer> s1;
		Stack<Integer> s2;
		
		public StackToQueue() {
			s1 = new Stack<>();
			s2 = new Stack<>();
		}
		
		public int size() {
			return s1.size();
		}
		
		// Store all elements from s1 to s2 and then push an element to s1 and then push back all elements from s2 to s1. // Linear time complexity
		public void add(int data) {
			while(s1.size() > 0) {
				s2.push(s1.pop());
			}
			s1.push(data);
			while(s2.size() > 0) {
				s1.push(s2.pop());
			}
		}
		
		// Constant time complexity which is O(1)
		public int remove() {
			if(size() == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				return s1.pop();
			}
		}
		
		// Constant time complexity which is O(1)
		public int peek() {
			if(size() == 0) {
				System.out.println("Queue underflow");
				return -1;
			} else {
				return s1.peek();
			}
		}	
	}

}
