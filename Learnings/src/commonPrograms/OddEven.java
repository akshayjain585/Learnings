package commonPrograms;

import java.util.Scanner;

public class OddEven {
	
	public static void oddEven(int num){
		if(num==0){
			System.out.println("Even number");
			return;
		}
		if(num==1){
			System.out.println("Odd Number");
			return;
		}
		boolean isEven = false;
		
		for(int i=2; i<num/2; i++){
			if(num%i == 0){
				isEven = true;
			}
		}
		if(isEven){
			System.out.println("Even Number");
		}else{
			System.out.println("odd Number");
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		oddEven(num);

}
	}
