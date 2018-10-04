/*
Practice Exercise 3
1) Launch new Browser 
2) Open Toolsqa.com website 
3) Click on About link ( On top navigation) 
4) Come back to Home page (Use ‘Back’ command) 
5) Again go back to About page (This time use ‘Forward’ command) 
6) Again come back to Home page (This time use ‘To’ command) 
7) Refresh the Browser (Use ‘Refresh’ command) 8) Close the Browser
 */
package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String baseURL = "http://www.toolsqa.com" ;
		driver.get(baseURL);

		driver.findElement(By.linkText("ABOUT")).click();
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.toolsqa.com");
		driver.navigate().refresh();
		driver.quit();
	}

}
