package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewCustomer {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String expectedURL = "http://www.demo.guru99.com/V4/manager/addcustomerpage.php" ;
		
		driver.findElement(By.linkText("New Customer"));
		
		String currentURL = driver.getCurrentUrl();
		
		if (currentURL.equals(expectedURL) {
			
			
			
			
		}
		
		
	}

}
