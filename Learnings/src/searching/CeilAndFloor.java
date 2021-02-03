package searching;

/*
 * Problem : Find the ceil and floor in an array. 
 * Sol: Ex: 10, 20, 30, 40, 50, 60, 70. Find the ceil and floor value for 65
 * ceil : Next greater element : 70
 * floor : Next smaller element : 60
 * Note : If element is already available in an array lets say 60, then ceil and floor is 60 only for the element..
 */

public class CeilAndFloor {
	
	public static void ceilAndFloor(int[] list, int num) {
		int start = 0;
		int end = list.length-1;
		int floor = 0;
		int ceil = 0;
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(list[mid] == num) {
				System.out.println("Floor is : "+list[mid]);
				System.out.println("Ceil is : "+list[mid]);
				break;
			}else if(list[mid] > num) {
				end = mid-1;
				ceil = list[mid];
			}else {
				start = mid+1;
				floor = list[mid];
			}
		}
		System.out.println("Floor is : "+floor);
		System.out.println("Ceil is : "+ceil);
	}
	
	public static void main(String[] args) {
		int[] list = {10,20,30,40,50,60,70,80};
		int num = -1;
		ceilAndFloor(list,num);
	}

}
