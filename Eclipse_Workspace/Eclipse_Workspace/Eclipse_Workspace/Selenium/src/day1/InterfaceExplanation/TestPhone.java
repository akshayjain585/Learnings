package day1.InterfaceExplanation;

public class TestPhone {

	public static void main(String[] args) {
		
		
	NokiaPhone n1 = new NokiaPhone();  //Creating the object "n1" of NokiaPhone class
	/*
	 * Now object "n1" can access all the variables and methods defined in the NokiaPhone class and as well as in the Interface Phone 
	 */
	
	n1.call();
	n1.msg();
	n1.Switchoff();
	
	Phone n2 = new NokiaPhone();      ////Creating the object "n2" of NokiaPhone class
	
	/*
	 * Here object "n2" can access only the functions defined in the Interface "Phone"
	 */
	
	n2.call();
	n2.msg();
	
	}

}

// WebDriver driver = new FirefoxDriver();
// It means WebDriver is an interface that has all the functions defined and inherited by FirefoxDriver class.