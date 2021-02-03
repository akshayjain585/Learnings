package pepCoding.FunctionsArrays;

public class BarChart {
	
	public static void barChart(int[] list) {
		int max = list[0];
		
		for(int i=1; i<list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		
		for(int floor=max; floor>=1; floor--) {
//		for(int floor=1; floor<=max; floor++) {
			for(int i=0; i<list.length; i++) {
				if(list[i] >= floor) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {2,5,6,1,4,8};
		barChart(list);
	}

}
