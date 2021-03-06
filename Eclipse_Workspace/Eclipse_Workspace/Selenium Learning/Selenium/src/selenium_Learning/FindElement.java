/*Practice Exercise 2

Launch new Browser
Open URL http://toolsqa.wpengine.com/automation-practice-form/
Click on the Link �Partial Link Test� (Use �patialLinkTest� locator and search by �Partial� word)
Identify Submit button with �tagName�, convert it in to string and print it on the console
Click on the Link �Link Test� (Use �linkTest� locator)*/

package selenium_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";

		driver.get(URL);
		driver.findElement(By.partialLinkText("Partial")).click();
		String submit = driver.findElement(By.tagName("button")).toString();
		System.out.println("The submit button tagname is "+submit);
		
		driver.findElement(By.linkText("Link Test")).click();
		driver.quit();
		
		
		


	}

}
