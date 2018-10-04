package day1.exercises;

/*
 * WAP to display the total sum of the string values defined in integer in an array !
 */

public class ExerciseB {

	public static void main(String[] args) {
		
		String[] str = {"10", "20", "30","40","50"};
		
		int total = 0 ;
		
		for(String temp : str){
			
			total += Integer.parseInt(temp) ;
			
		}
		
		System.out.println("Total is " +total);

	}

}
