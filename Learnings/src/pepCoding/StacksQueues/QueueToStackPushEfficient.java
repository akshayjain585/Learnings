package pepCoding.StacksQueues;

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * Problem Statement : Implement a stack using queue with constant time complexity for push() function and linear complexity for pop and top. So, if we somehow manage to do pop() and top() from queue like stack so that the last element comes out first. We will implement stack using queue.
 * Approach:
 * 1. Take 2 queues
 * 2. For any removal/retrieval of data, store all elements from q1 to q2 till q1 size is equal to 1 so that we can store the last element. Then store that as well to q2. Now, store all elements back to q1 and return the last element for peek and remove the last element for pop.
 *  
 *  HINT : Approach for QueuetoStackPUSH efficient and StackToQueueADD efficient is completely similar.
 */

public class QueueToStackPushEfficient {
	
	public static class QueueToStackPush {
		Queue<Integer> q1;
		Queue<Integer> q2;
		
		public QueueToStackPush() {
			q1 = new ArrayDeque<>();
			q2 = new ArrayDeque<>();
		}
		
		// In constant time which is O(1)
		public void push(int data) {
			q1.add(data);
		}
		
		// Linear time complexity
		public int pop() {
			if(q1.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				// Storing the elements from q1 to q2 till last element is left out in q1.
				while(q1.size() > 1) {
					q2.add(q1.remove());
				}
				// Remove the last element from q1 and store in data to return. But don't add it to q2 like below peek() function.
				int data = q1.remove();
				// Store back all elements from q2 to q1.
				while(q2.size() > 0) {
					q1.add(q2.remove());
				}
				return data;
			}			
		}
		
		// Linear time complexity
		// Same like above, instead of removing the last element, we will peek it, add it to q2 first and then add all elements back to q1.
		public int peek() {
			if(q1.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				while(q1.size() > 1) {
					q2.add(q1.remove());
				}
				int data = q1.remove();
				q2.add(data);
				while(q2.size() > 0) {
					q1.add(q2.remove());
				}
				return data;
			}
		}
		
		public int size() {
			return q1.size();
		}
		
	}

}
