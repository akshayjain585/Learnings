package day2.Functions;

public class Employee {

	double salary = 10000 ;
	double bonus = 5000 ;
	
	void calculatetotalsalary(){
		
		double TotalSalary = salary + bonus ;
		System.out.println("The total salary is " + TotalSalary);
	}
}
