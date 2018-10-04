package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DependentMethods {
	
	public WebDriver driver ;
	
	@Test(dependsOnMethods={"LaunchingWebsite"})
	  public void LoginLogout() {
		  driver.findElement(By.id("account")).click();
		  driver.findElement(By.id("log")).sendKeys("testuser_1");
		  driver.findElement(By.id("pwd")).sendKeys("Test@123");
		  driver.findElement(By.id("login")).click();
		  System.out.println("Login Successfully");
		  driver.findElement(By.id("account_logout")).click();
	  }
	  
	  
	 @Test
	  public void LaunchingWebsite() {
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String baseURL = "http://www.onlinestore.toolsqa.com" ;
		  driver.get(baseURL);
	  }

	  
	  @Test(dependsOnMethods={"LoginLogout"})
	  public void ClosingBrowser() {
		  driver.quit();
	  }
}
