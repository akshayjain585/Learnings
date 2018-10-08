/*
Practice Exercise 5
1) Launch new Browser
2) Open URL �http://www.toolsqa.com/automation-practice-switch-windows/�
3) Click on Button �Alert Box�, it will open a Pop Up Window generated by JavaScript
4) Switch to Alert window (Use �SwitchTo()Alert() command)
5) Close the Pop Up Window (Use Accept command)
 */


package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise5 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-switch-windows/";
		
		driver.get(baseURL);
		
		//driver.findElement(By.name("Alert Box")).click();
		driver.findElement(By.xpath(".//*[@id='post-1709']/div/p[7]/button")).click();
		
		Alert myAlert = driver.switchTo().alert();
		
		myAlert.accept();
		
		//String alertText = driver.switchTo().alert().getText();
		//System.out.println(alertText);
		
		driver.close();
		
		driver.quit();
	}

}