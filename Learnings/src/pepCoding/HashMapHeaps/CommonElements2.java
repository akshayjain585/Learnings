package pepCoding.HashMapHeaps;

/*
 * Problem: 
 * int[] list1 = {10,10,10,10,20,20,20,30,30,40,50};
 * int[] list2 = {10,10,10,20,20,30,50,60,70,90,50};		
 * Sol : 10 ,10 ,10 ,20 ,20 ,30 ,50
 * 
 * Idea is to print the common elements which has occurred atleast similar number of times in both the list. Ex : 10 has appeared atleast 3 times in both the list,
 * 20 atleast 2 times in both the list, 30 and 50 atleast once in both the list. 
 * 
 */

import java.util.HashMap;

public class CommonElements2 {
	
	public static void commonElementsCommonOccurrences(int[] list1, int[] list2) {
		HashMap<Integer, Integer> map = new HashMap<>(list1.length);
		
		for(Integer key : list1) {
			
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
				
			} else {
				map.put(key, 1);
			}
		}
		
		for(Integer key : list2) {
			// Here instead of removing the element from the map/set like we do in our previous common element program to avoid printing duplicate elements. We will decrement the occurence of it and print till it is > 0 and available in both the list as we need to print the elements duplicate till the occurence of that common element is same in both the list.
			if( map.containsKey(key) && map.get(key)>0 ) {
				System.out.print(key+" ,");
				map.put(key, map.get(key)-1);
			}
		}		
	}
	
	public static void main(String[] args) {
		int[] list1 = {10,10,10,10,20,20,20,30,30,40,50};
		int[] list2 = {10,10,10,20,20,30,50,60,70,90,50};
		
		commonElementsCommonOccurrences(list1,list2);
		
	}

}
