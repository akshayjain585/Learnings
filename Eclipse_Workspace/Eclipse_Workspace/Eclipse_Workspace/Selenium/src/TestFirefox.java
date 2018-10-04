import org.openqa.selenium.firefox.FirefoxDriver;    //Imported the FirefoxDriver class package to access the FirefoxDriver class and its methods/functions


public class TestFirefox {

	public static void main(String[] args) {
		
		new FirefoxDriver();  //This is the object of FirefoxDriver class created, after compiling it, it will open the blank firefox browser
		
		FirefoxDriver dr1 = new FirefoxDriver();   //dr1 is the object reference to access FirefoxDriver class and its methods and variables
		
		FirefoxDriver dr2 = new FirefoxDriver();   //dr2 is the object reference to access FirefoxDriver class and its methods and variables
		
		dr1.get("http://www.google.com");
		dr2.get("http://www.yahoo.com");
		
		
		

	}

}
