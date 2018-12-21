package arraysPrograms;

import java.util.HashSet;
import java.util.Set;

public class SubArray {
	
	static boolean isSubArray(int[] list1, int[] list2) {
		boolean result = false;
		for(int i=0; i<list2.length; i++) {
			for(int j=0; j<list1.length; j++) {
				if(list2[i]==list1[j]) {
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
	public static boolean isSub(int[] list1, int[] list2){
		boolean status = false;
		Set<Integer> set = new HashSet<>();
		for(int key : list2){
			set.add(key);
		}
		
		for(int key : list1){
			if(set.contains(key)){
				status = true;
			}
		}
		
		return status;
	}
	
	public static void main(String[] args) {
		int[] list1 =  {11, 1, 13, 21, 3, 7};
		int[] list2 = {11, 3, 7, 1};
		int[] list3 = {10, 5, 2, 23, 19};
		boolean result = isSubArray(list1,list2);
		System.out.println(result);
	}

}
