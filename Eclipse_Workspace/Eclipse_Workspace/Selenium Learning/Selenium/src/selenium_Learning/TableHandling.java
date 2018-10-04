/*Practice Exercise 1

Launch new Browser
Open URL “http://toolsqa.wpengine.com/automation-practice-table/”
Get the value from cell ‘Dubai’ and print it on the console
Click on the link ‘Detail’ of the first row and last column*/

package selenium_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
		driver.get(URL);
		driver.manage().window().maximize();
		
		//WebElement table = driver.findElement(By.id("content"));
		String sval = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(sval);
		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
		
		
		

	}

}
