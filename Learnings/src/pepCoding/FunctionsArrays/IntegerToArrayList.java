package pepCoding.FunctionsArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerToArrayList {
	
	public static void intToArray(int num) {
		List<Integer> list = new ArrayList<>();
		if( num !=0 ) {
			int temp = num%10;
			num = num/10;
			intToArray(num);
			list.add(temp);
		}
		System.out.print(list);;
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to convert to Array : ");
		int num = scan.nextInt();
		intToArray(num);
	}
}
