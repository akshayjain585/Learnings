package javatpointLearnings;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExampleMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Map<String,Integer> map = new HashMap<String,Integer>();
		//Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		Map<String,Integer> map = new TreeMap<String,Integer>();
		
		map.put("Akshay", 5);
		map.put("Harsh", 4);
		map.put("Nidhi", 2);
		map.put("Patel", 9);
		map.put("Abin", 7);
		
		System.out.println(map.get("Patel"));
		
		Set<String> keys = map.keySet();
		
		for(String key: keys){
			System.out.println(key+ " : " +map.get(key));
		}
		
	
		

	}

}
