/*
Practice Exercise 2
1) Launch new Browser
2) Open URL http://www.toolsqa.com/automation-practice-form/
3) Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
4) Identify Submit button with ‘tagName’, convert it in to string and print it on the console
5) Click on the Link “Link Test” (Use ‘linkTest’ locator)
 */

package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise2 {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-form/" ;
		
		driver.get(baseURL);
		
		driver.findElementByPartialLinkText("Partial").click();
		String tagName = driver.findElementByTagName("button").toString();
		
		System.out.println(tagName);
		
		driver.findElementByLinkText("Link Test").click();
		

	}

}
