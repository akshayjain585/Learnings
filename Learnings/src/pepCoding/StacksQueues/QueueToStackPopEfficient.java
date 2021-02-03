package pepCoding.StacksQueues;

/*
 * Problem Statement : Implement a stack using queue with constant time complexity for pop and top function and linear complexity for push. So, if we somehow manage to handle push() so that the elements gets added in reverse order. Our top and pop function will be in constant time complexity.
 * Approach :
 * 1. Take 2 queues.
 * 2. For any addition of data, make the queue 1 empty and store all the elements in q2. Store the data in Q1 and then remove all the elements from q2 and store in q1. 
 * With the above approach, when you do either pop() or top(), you will always have the latest element added to the queue at first place and will come out to behave like stack (LIFO)				
 * 
 * HINT : Approach for QueuetoStackPOP efficient and StackToQueueREMOVE efficient is completely similar.						
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueToStackPopEfficient {
	
	public static class QueueToStack {
		
		Queue<Integer> q1;
		Queue<Integer> q2;
		
		public QueueToStack() {
			q1 = new ArrayDeque<>();
			q2 = new ArrayDeque<>();
		}
		
		// Linear time complexity
		public void push(int data) {
			while(q1.size() > 0) {
				q2.add(q1.remove());
			}
			
			q1.add(data);
			
			while(q2.size() > 0) {
				q1.add(q2.remove());
			}
		}
		
		// Constant time complexity : O(1)
		public int pop() {
			if(q1.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return q1.remove();
			}
		}
		
		// Constant time complexity : O(1)
		public int peek() {
			if(q1.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return q1.peek();
			}
		}
		
		public int size() {
			return q1.size();
		}
		
	}

}
