package linkedListDS;

import java.util.LinkedList;

/*
 * Linkedlist to stack : Means implement linkedlist function which works like a stack
 * push() : Using addFirst() method of linkedlist, element will be inserted and keep on adding on top like stack as we use addFirst() method which changes head.
 * pop() : Using removeFirst() method of linkedlist, first element will be removed, which will be the top element of stack
 * top() : Using getFirst() method of linkedlist, top element will be returned.
 */

public class PCLinkedListToStack {
	
	public static class LLToStack{
		LinkedList<Integer> list;
		
		public  LLToStack() {
			list = new LinkedList<>();
		}
		
		public int size() {
			return list.size();
		}
		
		public void push(int data) {
			list.addFirst(data);
		}
		
		public int pop() {
			if(size()==0) {
				System.out.println("Stack underflow");
				return -1;
			}
			return list.removeFirst();
		}
		
		public int top() {
			if(size()==0) {
				System.out.println("Stack underflow");
				return -1;
			}
			return list.getFirst();
		}
	}

}
