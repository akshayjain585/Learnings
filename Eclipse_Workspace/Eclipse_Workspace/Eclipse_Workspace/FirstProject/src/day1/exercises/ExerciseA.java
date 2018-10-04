package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {
		
		double sal = 50000.55 ;
		
		double tax = 0 ;
		
		if(sal < 15000){
			
			tax = sal * .10 ;
			
		}else if (sal < 30000){
			
			tax = sal * .20 ;
			
		}else {
			
			tax = sal * .30 ;
		}
		
		System.out.println("The total tax to be paid is " + tax);

	}

}
