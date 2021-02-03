package pepCoding.HashMapHeaps;

/*
 * Problem : Common elements between two arrays.
 * int[] list1 = {10,10,10,20,30};
 * int[] list2 = {10,10,40,50,60};
 * Sol : 10
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
	
	public static void commonElementsUsingMap(int[] list1, int[] list2) {
		// list.length as want to declare the map with the same length of array list1
		HashMap<Integer, Integer> map = new HashMap<>(list1.length);
		
		for(Integer key: list1) {
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			} else {
				map.put(key, 1);
			}
		}
		
		for(Integer key: list2) {
			// Checking in map if it contains the key available in the other list. If it contains, then print and remove that key from map otherwise if same key is available again in list2 then map will return true for that using containsKey() function and print it again.
			if(map.containsKey(key)) {
				System.out.print(key+" , ");
				map.remove(key);
			}
		}	
	}
	
	public static void commonElementsUsingSet(int[] list1, int[] list2) {
		// list.length as want to declare the set with the same length of array list1
		HashSet<Integer> set = new HashSet<>(list1.length);
		
		// Directly add all the values as it stores only unique elements
		for(Integer key : list1) {
			set.add(key);
		}
		
		// Check if set contains the same key by traversing all the elements from list2
		for(Integer key : list2) {
			if(set.contains(key)) {
				System.out.print(key+" ,");
				// Remove the element from the set as the list2 might have duplicate elements and set will return true again with contain() method and print
				set.remove(key);
			}
		}
	}

	public static void printList(int[] list) {
		for(int i=0; i<list.length; i++) {
			System.out.print(list[i]+" ,");
		}
	}
	
	public static void main(String[] args) {
		
		// Below code is to declare array at run time
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size to be created: ");		
		// Declare the size of array
		int arraySize = scan.nextInt();
		
		// Initialize the array by its size taken from users input
		int[] list1 = new int[arraySize];
		int[] list2 = new int[arraySize];
		
		for(int i=0; i<list1.length; i++) {
			// Store the value in array from users input till its size defined.
			list1[i] = scan.nextInt();
		}
		
		for(int i=0; i<list2.length; i++) {
			// Store the value in array from users input till its size defined.
			list2[i] = scan.nextInt();
		}
		
		printList(list1);
		System.out.println();
		printList(list2);
		System.out.println();
		commonElementsUsingMap(list1, list2);
		System.out.println();
		commonElementsUsingSet(list1, list2);
	}

}
