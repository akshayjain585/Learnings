/*
Practice Exercise 9
1) Launch new Browser
2) Open URL “http://www.toolsqa.com/automation-practice-table/”
3) Get the value from cell ‘Dubai’ and print it on the console
4) Click on the link ‘Detail’ of the first row and last column
 */

package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise9 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		String baseURL = "http://www.toolsqa.com/automation-practice-table/" ;
		driver.get(baseURL);
		
		String sValue = driver.findElement(By.xpath(".//*[@id='post-1715']/div/div/div/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sValue);
		
		driver.findElement(By.xpath(".//*[@id='post-1715']/div/div/div/table/tbody/tr[1]/td[6]/a")).click();
		
		driver.close();
	}

}
