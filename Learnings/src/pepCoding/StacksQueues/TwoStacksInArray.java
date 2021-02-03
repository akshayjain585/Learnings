package pepCoding.StacksQueues;

/*
 * Problem : Implement 2 stacks using an array
 * Approach:
 * 1. Keep 2 top, one at -1 which is starting point of array and one is at last which is at list.length.
 * 2. For push1(), keep incrementing top1, for push()2, decrement top2
 * 3. For pop1(), return data and decrement top1 and for pop2() return data and increment back to list.length.
 */

public class TwoStacksInArray {
	
	public static class CustomTwoStacksInArray {
		int[] list;
		int top1;
		int top2;
		
		public CustomTwoStacksInArray(int capacity) {
			list = new int[capacity];
			top1 = -1;
			top2 = list.length;
		}
		
		public int size1() {
			// As top1 starts at -1 so when top1 =0, size is 1
			return top1 + 1;
		}
		
		// As top2 starts at list.length means top2 is at 0 as its outside the list only.
		public int size2() {
			return list.length - top2;
		}
		
		public void push1(int data) {
			// top1+1 means top2 is set at next element so there is no space to add any more element.
			if(top2 == top1 +1) {
				System.out.println("Stack overflow");
			} else {
				top1++;
				list[top1] = data;
			}
		}
		
		public void push2(int data) {
			if(top2 == top1 +1) {
				System.out.println("Stack overflow");
			} else {
				top2--;
				list[top2] = data;
			}
		}
		
		public int pop1() {
			if(size1() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				int data = list[top1];
				top1--;
				return data;
			}
		}
		
		public int pop2() {
			if(size2() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				int data = list[top2];
				top2++;
				return data;
			}
		}
		
		public int top1() {
			if(size1() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				int data = list[top1];
				return data;
			}
		}
		
		public int top2() {
			if(size1() == 0) {
				System.out.println("Stack underflow");
				return -1;
			} else {
				int data = list[top2];
				return data;
			}
		}	
	}

}
