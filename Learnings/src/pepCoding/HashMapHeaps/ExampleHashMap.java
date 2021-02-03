package pepCoding.HashMapHeaps;

/*
 * Imp functions of Map
 * 1. map.put(key, value); : KEY AVAILABLE - Update value. KEY NOT AVAILABLE - Insert key and value.
 * 2. map.get(key); : KEY AVAILABLE - retrieve the value. KEY NOT AVAILABLE - retrieve null
 * 3. map.containsKey(key); : KEY AVAILABLE - true, KEY NOT AVAILABLE - false
 * 4. map.size(); - Returns the map's size.
 * 5. map.keySet(); - Returns all the keys from map. Its a function of set.
 * 6. map.remove(key); - Remove the key from map
 * 
 * Note : All functions above are of O(1) time complexity
 * 1. You can have any number of null values as its mainly dependent on keys and not values.
 * 2. You can have maximum of one null key, if more than one null key is defined then latest one will be considered only.
 * 3. You can have only unique keys, if duplicate key is given then latest one will be considered only.
 * 
 * Summary : Duplicate and more than one null key will result only in taking the latest entry of key and value as only one null key and unique key is allowed in map.
 * 
 */

import java.util.HashMap;
import java.util.Set;

public class ExampleHashMap {
	
	public static void main(String[] args) {
		
		// Created a hashmap of String as a key and integer as a value
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put(null, 200);
		map.put(null, 135);
		map.put("Pak", 40);
		map.put("US", 20);
		map.put("UK", 100);
		map.put("UK", 10);
				
		System.out.println("The map size is :"+map.size()+" and the map is "+ map);
		
		// Key available : Update the value
		map.put("India",200);
		
		// Key not available : Insert the value
		map.put("Nigeria", 5);
		
		// keySet() will return all keys from map. It is used when you want to traverse through all the keys
		Set<String> set = map.keySet();
		
		System.out.println(set);
		
		for(String key : set) {
			System.out.print(map.get(key)+" , ");
		}	
		
	}

}
