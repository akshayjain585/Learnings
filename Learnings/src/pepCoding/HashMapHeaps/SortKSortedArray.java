package pepCoding.HashMapHeaps;

/*
 * Problem : Sort a K sorted array. 
 * Ex : {2,3,1,4,6,7,5,8,9} : This array is K sorted array where K is 2. Means, every element is placed at upto 2 places either before/after.
 * i.e In above case, 2 should be at 3 place, means placed at 1 position later (upto K), similarly 1 is placed at 3 position (Placed at upto 2 position which is K) 
 */
import java.util.PriorityQueue;

public class SortKSortedArray {
	
	// Time : O(nlogn), Space : O(k) : At a time we are storing only k elements in priority queue
	public static void sortKSortedArray(int[] list, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
//		 Created a priority queue of K elements and add all the elements till K position as the element could be present at atmost K position. Lets say K=2, so the element could be at 0,1,2
		for(int i=0; i<=k; i++) {
			pq.add(list[i]);
		}
		
		// Traverse to the list from k+1 position till last as till K we have already added in above loop
		for(int i=k+1; i<list.length; i++) {
			// Reason to remove now as till K we have to find out the sorted element, so by doing remove() will fetch the lowest element by default as highest priority
			System.out.print(pq.remove()+" , ");
			// Here we are adding one element so that the next time also we have K element in the queue and can remove the lowest element among them.
			pq.add(list[i]);
		}
		
		// To print left out elements
		while(pq.size() > 0) {
			System.out.print(pq.remove()+" , ");
		}
	}
	
	// Time : O(nlogn), Space : O(n) : Adding all elements in PQ.
	public static void pqAnotherApproach(int[] list, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i=0; i<list.length; i++) {
			pq.add(list[i]);
		}
		
		while(pq.size() > 0) {
			System.out.print(pq.remove()+" , ");
		}
		System.out.println();
		
	}
	
	// Easy to remember like K largest element.
	// Time : O(nlogn), Space : O(k) : At a time we are storing only k elements in priority queue
	public static void sortKSortedArrayLikeKLargest(int[] list, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0; i<list.length; i++) {
			if(i <= k) {	// As upto k element, means, 0,1,2 for k =2
				pq.add(list[i]);
			}else {
				System.out.print(pq.remove()+" , ");
				pq.add(list[i]);
			}
		}
		
		while(pq.size() > 0) {
			System.out.print(pq.remove()+" , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {2,3,1,4,6,7,5,8,9};
		int k = 2;
		
		sortKSortedArray(list,k);	//The Min Heap based method takes O(nLogk) time and uses O(k) auxiliary space.: https://www.geeksforgeeks.org/nearly-sorted-algorithm/
		System.out.println();
		pqAnotherApproach(list,k);
		sortKSortedArrayLikeKLargest(list,k);

	}

}
