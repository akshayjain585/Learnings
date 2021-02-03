package pepCoding.StacksQueues;

import java.util.Stack;

/*
 * Problem : Print the next greater element to the right for the input array.
 * Example : {2,5,9,3,1,12,6,8,7} ==> {5,9,12,12,12,-1,8,-1,-1}
 * Approach : 
 * 1. Print -1 for last element (as it won't have any element afterwards) or for any element whose next greater element to right is not present.
 * 2. Reverse loop and strategy would be : 
 * a) Pop smaller element than the current one.
 * b) If stack becomes empty, print -1 or print the element if find greater element.
 * c) Push the current element to be checked for the remaining array.
 */

public class NextGreaterElemToTheRightLeft {
	
	public static int[] nextGreaterElemToRight(int[] list) {
		
		// Take new array of same size of input array
		int[] res = new int[list.length];
		
		Stack<Integer> st = new Stack<>();
		
		// Push last element to stack
		st.push(list[list.length-1]);
		
		// Store -1 at the last element.
		res[list.length-1] = -1;
		
		// Run the loop from last-1 element till 0
		for(int i=list.length-2 ; i>=0; i--) {
			// Pop the smaller element, print either -1/larger element if found, Push ourself
			
			while(st.size() > 0 && list[i]>=st.peek()) {
				st.pop();
			}
				if(st.size() == 0) {
					res[i] = -1;
				} else {
					res[i] = st.peek();
				}
				st.push(list[i]);
		}
		return res;
	}
	
// Logic is to keep popping the items in stack till either the size becomes 0 or we find the greater element than the current one.
// If size becomes 0, means no greater element present, put -1. If greater element found put that element. Push ourself.
	
	public static int[] nextGreaterElemToLeft(int[] list) {
		
		// Take new array of same size of input array
		int[] res = new int[list.length];
		
		Stack<Integer> st = new Stack<>();
		
		// Push first element to stack
		st.push(list[0]);
		
		// Store -1 as there is no greater element to the left.
		res[0] = -1;
		
		// Run the loop from i+1 till length of the array
		for(int i=1 ; i<list.length; i++) {
			// Pop the smaller element, print either -1 is stack becomes empty/larger element if found, Push ourself
			
			while(st.size() > 0 && list[i]>=st.peek()) {
				// Pop till large element found or stack becomes empty
				st.pop();
			}
				if(st.size() == 0) {
					// if stack becomes empty, means no greater element. Print -1.
					res[i] = -1;
				} else {
					// If larger element found, print the same and push ourself for rest of the array
					res[i] = st.peek();
				}
				// Push ourself for remaining array.
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
		int[] list = {2,5,9,3,1,12,6,8,7};
		System.out.print("Original array ==> ");
		printList(list);
		System.out.println();
		int[] res = nextGreaterElemToRight(list);
		printList(res);
		System.out.println();
		int[] res1 = nextGreaterElemToLeft(list);
		printList(res1);
	}
	

}
