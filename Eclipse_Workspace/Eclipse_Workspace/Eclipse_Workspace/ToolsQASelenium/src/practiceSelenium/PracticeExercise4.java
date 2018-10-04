/*
Practice Exercise 4
1) Launch new Browser
2) Open URL “http://www.toolsqa.com/automation-practice-switch-windows/”
3) Get Window name (Use GetWindowHandle command)
4) Click on Button “New Message Window”, it will open a Pop Up Window
5) Get all the Windows name ( Use GetWindowHandles command)
6) Close the Pop Up Window (Use Switch Command to shift window)
 */

package practiceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-switch-windows/" ;
		driver.get(baseURL);
		String windowName = driver.getWindowHandle();
		System.out.println(windowName);
		
		driver.findElement(By.id("newMessage")).click();
		
		Set<String> allWindowNames = driver.getWindowHandles();
		System.out.println(allWindowNames);
		
		for(String handle1 : driver.getWindowHandles()){
			driver.switchTo().window(handle1);
		}
		
		driver.close();
		
		driver.quit();

	}

}
