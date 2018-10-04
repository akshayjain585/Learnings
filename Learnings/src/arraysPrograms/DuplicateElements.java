package arraysPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
	
	public static void duplicateElement(int[] list){
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(Integer key : list){
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		
		for(Integer key: set){
			if(map.get(key)>1){
				System.out.println("The duplicate element is: "+key+" and the count is: "+map.get(key));
			}
		}
		
		System.out.println("After removing duplicates from List");
		
		for(Integer key : set){
			System.out.print(key+", ");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={5,3,5,2,5,5,1,1,3};
		
		duplicateElement(arr);
		//removeDuplicates(arr);
	}

}
