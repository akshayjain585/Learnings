package linkedListDS;

import java.util.LinkedList;

/*
 * Linkedlist to Queue : Means implement linkedlist function which works like a queue
 * enqueue() : Using addLast() method of linkedlist, element will be inserted and first time there will be 0 element and keep on adding in queue as we use addLast() method.
 * dequeue() : Using removeFirst() method of linkedlist, first element will be removed, which will be the first element of queue
 * peek(): Returns top element : Using getFirst() method of linkedlist, top element will be returned.
 */

public class PCLinkedListToQueue {
	
	public static class LLToQueue{
		LinkedList<Integer> list;
		
		public LLToQueue() {
			list = new LinkedList<>();
		}
		
		public int size() {
			return list.size();
		}
		
		public void enqueue(int data) {
			list.addLast(data);
		}
		
		public int dequeue() {
			if(size()==0) {
				System.out.println("Queue underflow");
				return -1;
			}
			return list.removeFirst();
		}
		
		public int peek() {
			if(size()==0) {
				System.out.println("Queue underflow");
				return -1;
			}
			return list.getFirst();
		}
	}

}
