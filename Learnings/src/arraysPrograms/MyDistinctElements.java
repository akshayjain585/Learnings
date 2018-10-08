package arraysPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyDistinctElements {
	 
    public static void printDistinctElements(int[] arr){
         
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = true;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }
    
    public static void distictUsingHashMap(int[] list){
    	
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int key : list){
    		
    		if(map.containsKey(key)){  			
    			map.put(key, map.get(key)+1);
    		}else{
    			map.put(key, 1);
    		}
    	}
    	
    	Set<Integer> s = map.keySet();
    	for(Integer key : s){
    		System.out.print(key+",");
    	}
    	
    	
    }
     
    public static void main(String a[]){
         
        int[] nums = {5,5,2,7,2,4,7,8,2,3};
        MyDistinctElements.printDistinctElements(nums);
        System.out.println();
        distictUsingHashMap(nums);
    }
}
