package pepCoding.HashMapHeaps;

/*
 * Problem : Find the k largest element from the list and print them in increasing order
 * Complexity : O(nlog(n))
 * 	Time : O(nlogn): As traversing the list takes n and searching/adding element takes logn so n+logn. Space is O(k): K = k largest element.
 * In second approach, Time : O(nlogn), Space : O(n)
 */

import java.util.Collections;

import java.util.PriorityQueue;

public class KLargestElement {
	
	public static void kLargestElementIncreasingOrder(int[] list, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<list.length; i++) {
			
			// Add the same number of elements to the priority queue for which we need the largest
			if( i < k ) {
				pq.add(list[i]);
			} else {
				// Once added using above code, the code will comes to else block and here check if the next element from loop is greater than the peek() element (which is smallest element as by default for priority queue). If yes, then remove the smallest element and add the greater element.
				if (list[i] > pq.peek()) {
					// Removing the smaller element available in priority queue
					pq.remove();
					// Adding the larger element from the for loop.
					pq.add(list[i]);
				}
			}
		}
		
		// At this point pq only has 4 elements as we need to print them in increasing order
		while(pq.size() > 0) {
			// Printing them in increasing order as remove() will remove the highest priority element and by default it takes the smallest element as the highest priority
			System.out.print(pq.remove()+" , ");
		}
		
	}
	

	public static void kLargestElementDecreasingOrder(int[] list, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		// nlog(n)
		for(int val : list) {
			pq.add(val);
		}
		
		int count = k;
		// nlog(n)
		while(count > 0) {
			System.out.print(pq.remove()+" , ");
			count--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {90,10,20,40,80,60,70,30,50};
		
		kLargestElementIncreasingOrder(list, 4);
		System.out.println();
		kLargestElementDecreasingOrder(list,4);

	}

}
