package arraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOccurOddEvenTimes {
	
	public static void numberOccurOdd(int[] list){
		Map<Integer,Integer> map = new HashMap<>();
		
		for(Integer key : list){
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(Integer key : set){
			if(map.get(key)%2!=0){
				System.out.println("The number occurred odd times are : "+key+" and the value is :"+map.get(key));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] list = {2,3,5,7,9,3,5,7,2,1,6,8,6,6,8,8,8,8};
		numberOccurOdd(list);
	}

}
