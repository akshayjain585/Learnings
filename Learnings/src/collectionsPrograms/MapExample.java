package collectionsPrograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<String,Integer> map = new HashMap<String,Integer>();
		//Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		Map<String,Integer> map = new TreeMap<String,Integer>();
		
		map.put("Harsh", 5);
		map.put("Patel", 2);
		map.put("Nidhi", 1);
		map.put("Abin", 7);
		map.put("Gaurav", 3);
		map.put("Rajneesh", 1);
		
		System.out.println("The size of the map is: "+map.size());
		System.out.println(map.containsKey("Nidhi"));
		if(map.containsKey("Gaurav")==true){
			System.out.println("The value of key Gaurav is "+map.get("Gaurav"));
		}
		
		
		//Iterating through for each loop
//		for(String obj : map.keySet()){
//			System.out.println("Key: "+obj+ " value: "+map.get(obj));
//		}
		
		//Iterating using Set interface and keySet method
//		Set<String> obj = map.keySet();
//		for(String obj1: obj){
//			System.out.println("Key :" +obj1+ "value: "+map.get(obj1));
//		}
		
		//Iterating using Set and Iterator
		Iterator<String> obj = map.keySet().iterator();
		while(obj.hasNext()){
			String key = obj.next();
			System.out.println("Key "+key+ " Value: "+map.get(key));
			
			
		}
		
	}

}
