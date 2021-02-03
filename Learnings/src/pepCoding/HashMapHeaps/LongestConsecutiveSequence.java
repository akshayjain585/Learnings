package pepCoding.HashMapHeaps;

/*
 * Problem: Longest consecutive sequence
 * Ex : 10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2
 * Sol : Below are the seq which will come up while solving
 * Seq 1 : 8,9,10,11,12
 * Seq 2 : 5,6
 * Seq 3 : 1,2,3
 * Seq 4 : 15
 * 
 * Thus, Seq1 has the longest consecutive seq
 */

import java.util.HashMap;

public class LongestConsecutiveSequence {
	
	public static void longestConseSequence(int[] list) {
		
		// Declare a map of Integer v/s boolean
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		// Declare all the elements in a list as true assuming that all elements are the starting point of longest consecutive sequence
		for(int key : list) {
			map.put(key, true);
		}
		
		/*
		 *  Traversing through all elements and marking all elements as false whichever has an element less than that.
		 *  Ex for element 5, if you already have 4 also present in list then 5 can not be the starting point of the longest consecutive sequence.
		 *  Similarly for 4 if 3 is available then we will mark 4 as false and 3 will be left out as true as we marked all elements as true in previous loop. 
		 */
 
		for(int key : list) {
			if(map.containsKey(key-1)) {
				map.put(key, false);
			}
		}
		
		// Assume that the max consecutive length is 0 and starting point is 0 and work only on the keys which are true as they are the only one which doesn't have any element less than that so that could be the sequence. Below logic is to find out the longest consecutive seq. 
		int maxConseSeqLength = 0;
		int startingPoint = 0;
					
		for(int key : list) {
			if(map.get(key)==true) {
				// Assume the temp seq length is 1 and starting point is key
				int tempConseSeqLength = 1;
				int tempStartingPoint = key;
				
				// We will try to find out the key if it has any element greater than 1 and increase the count of our temp seq length
				// Reason we are doing + tempConseSeqLength instead of doing +1 because below we are incrementing the counter so everytime the value will be +1 and we can't add tempStartingPoint as that will result in different array values.
				while(map.containsKey(tempStartingPoint+tempConseSeqLength)) {
					tempConseSeqLength++;
				}
				
				// If temp count is greater then assign it to assumed max length and starting point
				if(tempConseSeqLength > maxConseSeqLength) {
					maxConseSeqLength = tempConseSeqLength;
					startingPoint = tempStartingPoint;
				}
			}			
		}
		// Run the loop till the length of max consecutive length and print from 
		for(int i=0; i<maxConseSeqLength; i++) {
			System.out.print(startingPoint+" , ");
			startingPoint++;
			// Incremented the starting point till the length of consecutive seq in the list
		}
		
	}
	
	public static void main(String[] args) {
		int[] list = {10, 5, 9, 1, 11, 8, 6, 15, 3, 12, 2};
		longestConseSequence(list);
	}
}
