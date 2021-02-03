package pepCoding.StacksQueues;

import java.util.Stack;

/*
 * Problem : Implement a stack which also has min() function that returns the minimum element from stack in O(1).
 * Solution : 
 * 1. Make 2 stacks
 * 2. Add all the data in first stack, and add the data in second stack only if the data is lesser than the peek() of second stack or if size is 0 of second stack means for first time.
 * Complexity:
 * Time : O(1) : Without traversing, directly we are returning the min element from stack2.
 * Space : O(n) : As we are creating a stack2 to store all min data. 
 */

public class MinStack {
	
	public static class CustomMinStack {
		
		Stack<Integer> allData;
		Stack<Integer> minData;
		
		public CustomMinStack() {
			allData = new Stack<>();
			minData = new Stack<>();
		}
		
		public int size() {
			return allData.size();
		}
		
		public void push(int data) {
			// Push all elements in stack 1.
			allData.push(data);
			
			// Push element in stack 2 only if its size is either 0 for first time or when data is lesser than its peek to maintain the minimum element on top in stack2.
			if(minData.size()==0 || data <= minData.peek()) {
				minData.push(data);
			}
		}
		
		public int pop() {
			if(allData.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				int val = allData.pop();
				if(val == minData.peek()) {
					minData.pop();
				}
				return val;
			}			
		}
		
		public int peek() {
			if(allData.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return allData.peek();
			}
		}
		
		public int min() {
			if(allData.size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				return minData.peek();
			}
		}
		
	}

}
