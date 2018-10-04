package arraysPrograms;

import java.util.Scanner;

public class NumberToWord {
	
	public String oneToHund(int n){
		String s = "";
		while(n!=0){
			if(n==1){
				s = s + "One ";
				n =0;
			}else if(n==2){
				s = s+ "Two ";
				n=0;
			}else if(n==3){
				s = s+ "Three ";
				n=0;
			}else if(n==4){
				s = s+ "Four ";
				n=0;
			}else if(n==5){
				s = s+ "Five ";
				n=0;
			}else if(n==6){
				s = s+ "Six ";
				n=0;
			}else if(n==7){
				s = s+ "Seven ";
				n=0;
			}else if(n==8){
				s = s+ "Eight ";
				n=0;
			}else if(n==9){
				s = s+ "Nine ";
				n=0;
			}else if(n==10){
				s = s+ "Ten ";
				n=0;
			}else if(n==11){
				s = s+ "Eleven ";
				n=0;
			}else if(n==12){
				s = s+ "Twelve ";
				n=0;
			}else if(n==13){
				s = s+ "Thirteen ";
				n=0;
			}else if(n==14){
				s = s+ "Fourteen ";
				n=0;
			}else if(n==15){
				s = s+ "Fifteen ";
				n=0;
			}else if(n==16){
				s = s+ "Sixteen ";
				n=0;
			}else if(n==17){
				s = s+ "Seventeen ";
				n=0;
			}else if(n==18){
				s = s+ "Eighteen ";
				n=0;
			}else if(n==19){
				s = s+ "Nineteen ";
				n=0;
			}else if(n>=20 && n<30){
				s = s+ "Twenty ";
				n = n-20;
			}else if(n>=30 && n<40){
				s = s+ "Thirty ";
				n = n-30;
			}else if(n>=40 && n<50){
				s = s+ "Fourty ";
				n = n-40;
			}else if(n>=50 && n<60){
				s = s+ "Fifty ";
				n = n-50;
			}else if(n>=60 && n<70){
				s = s+ "Sixty ";
				n = n-60;
			}else if(n>=70 && n<80){
				s = s+ "Seventy ";
				n = n-70;
			}else if(n>=80 && n<90){
				s = s+ "Eighty ";
				n = n-80;
			}else if(n>=90 && n<100){
				s = s+ "Ninty ";
				n = n-90;
			}
		}
		return s;
		
	}
	
	public String convert(int n){
		String s = "";
		while(n!=0){
			if(n>=1 && n<100){
				s = s+ oneToHund(n);
				n=0;
			}else if(n>=100 && n<1000){
				s = s+ oneToHund(n/100);
				s = s+ "Hundred ";
				n = n%100;
			}else if(n>=1000 && n<10000){
				s = s+ oneToHund(n/1000);
				s = s+ "Thousand ";
				n = n%1000;
			}else if(n>10000 && n<100000){
				s = s+ oneToHund(n/10000);
				s = s+ "Million ";
				n = n%10000;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberToWord obj = new NumberToWord();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to print: ");
		int n = scan.nextInt();
		String s = obj.convert(n);
		System.out.println(s+"Dollar");

	}

}
