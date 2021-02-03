package leetCode.Google;

/*
 * https://leetcode.com/problems/moving-average-from-data-stream/
 * Design a system such that you have to take the average of numbers present in moving data stream with the given size. If size exceeds, eliminate the first element due to which we have taken queue and it should work like a sliding window.
 * 
 * Approach : (Queue size is passed in constructor)
 * 1. Take queue, add elements and return average based on current queue size.  
 * 2. If queue size increases then the given size, remove first element, remove its sum, add the new element to the queue, add element's to the sum and return the average.
 * 
 */

import java.util.ArrayDeque;
import java.util.Queue;

public class MovingAverageFromDataStream {
	
	Queue<Integer> queue;
	int size;
	double sum;
	
	public MovingAverageFromDataStream(int size) {
		queue = new ArrayDeque<>();
		this.size = size;
		sum = 0;
	}
	
	public double next(int val) {
		if(queue.size() == size) {
			int data = queue.remove();
			sum = sum - data;
		}
		queue.add(val);
		sum = sum + val;
		return sum/queue.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovingAverageFromDataStream mq = new MovingAverageFromDataStream(4);
		System.out.println(mq.next(5));		// Average of only 1 element so 5/queue.size() which is also 1
		System.out.println(mq.next(10));	// Average of 2 element so 5+10/queue.size() : Queue size is now 2
		System.out.println(mq.next(15));	// Average of 3 element so 5+10+15/queue.size() : Queue size is now 3
		System.out.println(mq.next(20));	// Average of 4 element so 5+10+15+20/queue.size() : Queue size is now 4
		// At this stage queue size is full so it will remove the element first, deduct from sum and add the next value, add it to the sum and take the average.
		//Average of 4 element after removing and deducting 1st would be  so 10+15+20+25/queue.size() : Queue size is now 4 only as first elem is removed due to queue.
		System.out.println(mq.next(25));	
	}

}
