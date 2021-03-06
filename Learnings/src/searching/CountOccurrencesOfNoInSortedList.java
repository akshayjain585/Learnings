/*
 * 1. Using Binary search the complexity is O(logn);
 * 2. Using Linear search the complexity is O(n);
 * 
 */

package searching;

public class CountOccurrencesOfNoInSortedList {
	
	public static int lSearch(int[] list, int key){
		int count =0;
		for(int i=0; i<list.length; i++){
			if(list[i]==key){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {0,0,0,0,2,3,3,3,3,3,3,3,3,3,3,6,6,7};
		int key = 3;
		//Using the other class methods by creating an object of that class to get first and last occurrence from the sorted list
		FirstLastOccurrenceInSortedList fl = new FirstLastOccurrenceInSortedList();
		int firstOcc = fl.firstOccurrenceBS(list, key); //Get First occurrence from the list
		int lastOcc = fl.lastOccurrenceBS(list, key);  //Get Last occurrence from the list
		int result = (lastOcc-firstOcc) + 1;           //Count = (last-first) +1 : Since, last and first are index not the counts
		System.out.println("The count of occurrences of a number in sorted list is: "+result);
		System.out.println(lSearch(list,key));

	}

}
