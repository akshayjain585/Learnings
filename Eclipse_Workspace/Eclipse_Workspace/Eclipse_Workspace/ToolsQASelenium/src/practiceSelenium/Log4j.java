package practiceSelenium;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log4j {
	
	public static void main(String[] args) {
		
		//Logger Log = Logger.getLogger(Log4j.class.getName());
		Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
		//DOMConfigurator.configure("log4j.xml");
		APPLICATION_LOGS.info("******Hi***");				                	
		WebDriver driver = new FirefoxDriver();
		//Log.info("Instantiating the object of WebDriver interface");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Log.info("Defining the implicit time of 5 sec throughout the run");
		
		String baseURL = "http://www.onlinestore.toolsqa.com" ;
		driver.get(baseURL);
		//Log.info("Opening the URL using baseURL String data type");
		
		driver.findElement(By.id("account")).click();
        //Log.info("Click action performed on My Account link");
        
        driver.findElement(By.id("log")).sendKeys("testuser_1");
        //Log.info("Username entered in the Username text box");
        
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        //Log.info("Password entered in the Password text box");
        
        driver.findElement(By.id("login")).click();
       // Log.info("Click action performed on Submit button");
        
        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        driver.findElement(By.id("account_logout"));
       // Log.info("Click action performed on Log out link");
       // Close the driver
       driver.quit();
        //Log.info("Browser closed");        
	}
	
	//public void log(String msg){
        //APPLICATION_LOGS.debug("hi");
//}

}
