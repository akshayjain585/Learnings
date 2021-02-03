package pepCoding.StacksQueues;

/*
 * Problem: {10, 4, 5, 90, 120, 80} : Stock span means assume need to find out next greater element on the left like previous program. Instead of printing the element, we need to code this program using index.
 * Solution : {1 , 1 , 2 , 4 , 5 , 1 }
 */

import java.util.Stack;

public class StockSpan {
	
	public static int[] stockSpan(int[] list) {
		
		// Take new array of same size of input array
		int[] res = new int[list.length];
		
		Stack<Integer> st = new Stack<>();
		
		// Push first element to stack
		st.push(list[0]);
		
		// Store 1 at the first element as there is no span before that.
		res[0] = 1;
		
		// Initialize the counter variable to keep a count of index while popping smaller elements as the span would be count+1
		int count = 0;
	
		// Run the loop from i+1 till the length of the array
		for(int i=1 ; i<list.length; i++) {
			// Pop the smaller element, print either i+1 or
			
			while(st.size() > 0 && list[i]>=st.peek()) {
				st.pop();
				count++;
			}
				if(st.size() == 0) {
					// Put i+1 in the array as the thats the highest span and reset counter.
					res[i] = i+1;
					count = 0;
				} else {
					// Put count+1 as count would be the number of times element is popped.
					res[i] = count+1;
					count = 0;
				}
				// Push ourself
				st.push(list[i]);
		}
		return res;
	}
	
	public static void printList(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" , ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] list = {10, 4, 5, 90, 120, 80};
		int[] res = stockSpan(list);
		printList(res);

	}

}
