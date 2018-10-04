/*
Practice Exercise 1
1) Launch new Browser
2) Open URL http://www.toolsqa.com/automation-practice-form/
3) Type Name & Last Name (Use Name locator)
4) Click on Submit button (Use ID locator)
 */

package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-form/" ;
		
		driver.get(baseURL);
		
		driver.findElement(By.name("firstname")).sendKeys("Akshay");
		driver.findElement(By.name("lastname")).sendKeys("Jain");
		driver.findElement(By.id("submit")).click();
		

	}

}
