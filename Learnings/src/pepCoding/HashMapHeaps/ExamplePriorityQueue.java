package pepCoding.HashMapHeaps;

/*
 * Priority Queue : Type of data structure, which helps in sorting as well. Its like queue only. But it removes the element based on the priority. 
 * Queue is a list where insertion is done at one end and removal is done at the other end. Priority queue does not have any ends. ... In a priority queue, elements can be inserted in any order but removal of the elements is in a sorted order.
 * Functions : 
 * add() : Adds data to priority queue : O(logn)
 * remove() : Removes data from priority queue : O(logn)
 * peek() : Returns top/head of the queue. Means its priority is at highest for removal. : O(1)
 * 
 * Note : By default, priority queue gives highest priority to lowest value. Below example is for ranks means 1st rank has highest priority to come out.
 * 
 * Good point : It helps in doing sorting as well in O(nlog(n))
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class ExamplePriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// We can use Collections.reverseOrder in constructor if we want Priority queue to give highest priority to largest value
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		
		int[] ranks = {99,4,1,67,40,34,84,30};
		
		// Complexity for below loop : nlog(n) as it will run n times in a loop and we are using add() which is log(n). Thus, n + log(n) = nlog(n)
		for(int val : ranks) {
			pq.add(val);
		}
		
		// Complexity for below loop : nlog(n) as it will run n times in a loop and we are using remove() which is log(n) and peek is O(1). Thus, n + log(n) + 1 = nlog(n) 
		while(pq.size() > 0) {
			System.out.print(pq.peek()+" , ");
			pq.remove();
		}
	}

}
