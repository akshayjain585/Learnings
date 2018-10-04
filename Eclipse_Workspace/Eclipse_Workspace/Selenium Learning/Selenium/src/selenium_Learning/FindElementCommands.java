/*Practice Exercise 1

Launch new Browser
Open URL http://toolsqa.wpengine.com/automation-practice-form/
Type Name & Last Name (Use Name locator)
Click on Submit button (Use ID locator)*/

package selenium_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(URL);
		driver.findElement(By.name("firstname")).sendKeys("namefirst");
		driver.findElement(By.name("lastname")).sendKeys("namelast");
		driver.findElement(By.id("submit")).click();
		driver.quit();

	}

}
