package commonPrograms;

import java.util.Scanner;

public class Armstrong {
	
	public static void isArmstrong(int num){
		int temp = num;
		int rev =0;
		int r;
		while(num>0){
			r = num%10;
			rev = rev + (r*r*r);
			num = num/10;
		}
		if(temp == rev){
			System.out.println("Armstrong number");
		}else{
			System.out.println("Not a armstrong number");
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		isArmstrong(num);

}

}
