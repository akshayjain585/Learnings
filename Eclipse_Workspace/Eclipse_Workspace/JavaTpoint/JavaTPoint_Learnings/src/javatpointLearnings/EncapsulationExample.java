package javatpointLearnings;

/*1. The data members are private in Encapsulation
2. Getters and Setters methods are required to access those private variables
3. So encapsulation means hiding the important features of a class which is not 
been needed to be exposed outside of a class and exposing only necessary things of a class. Here hidden part of a class acts like Encapsulation which is nothing but private variables and exposed part of a class acts like Abstraction. 
 */

public class EncapsulationExample {

	private int empID;
	private String empName;

	public void setEmpId(int empId){
		this.empID=empId;
	}

	public int getEmpID(){
		return empID;
	}

	public void setEmpName(String empName){
		this.empName=empName;
	}

	public String getEmpName(){
		return empName;
	}


}

 class EncapsulationTest{
	public static void main(String[] args){

		EncapsulationExample obj = new EncapsulationExample();

		obj.setEmpId(15);
		obj.setEmpName("Using Set Method");
		System.out.println(obj.getEmpID()+ " and " +obj.getEmpName());

	}
}
