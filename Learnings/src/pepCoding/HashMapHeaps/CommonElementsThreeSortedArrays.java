package pepCoding.HashMapHeaps;

public class CommonElementsThreeSortedArrays {
	
	public static void commonElements(int[] list1, int[] list2, int[] list3) {
		int i = 0, j=0, k=0;
		
		while(i<list1.length && j<list2.length && k<list3.length) {
			
			// If x = y and y = z, print any of them and move ahead 
            // in all arrays 
			if(list1[i] == list2[j] && list2[j] == list3[k]) {
				System.out.print(list1[i]+" , ");
				i++;
				j++;
				k++;
			
	             // x < y 
			}else if(list1[i] < list2[j]) {
				i++;
	             // y < z 
			}else if(list2[j] < list3[k]) {
				j++;
	             // We reach here when x > y and y > z, i.e., z is smallest 
			}else {
				k++;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] list1 = {1, 5, 10, 20, 40, 80};
		int[] list2 = {6, 7, 20, 80, 100};
		int[] list3 = {3, 4, 15, 20, 30, 70, 80, 120};
		
		commonElements(list1,list2,list3);
	}

}
