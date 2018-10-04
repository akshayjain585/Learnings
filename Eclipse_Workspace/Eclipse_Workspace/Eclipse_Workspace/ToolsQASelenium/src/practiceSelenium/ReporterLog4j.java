package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog4j {
	
	public WebDriver driver ;
	//Logger Log = Logger.getLogger(Log.class.getName());
	
	  @Test(priority=1)
	  public void SigInReporterLog() {
		  driver.findElement(By.id("account")).click();
		  driver.findElement(By.id("log")).sendKeys("testuser_1");
		  driver.findElement(By.id("pwd")).sendKeys("Test@123");
		  driver.findElement(By.id("login")).click();
		  System.out.println("Login Successfully");
		  driver.findElement(By.id("account_logout")).click();
		  Reporter.log("SignIn Successful");
	  }
	  
	  
	  @Test(priority=0)
	  public void LaunchingReporterLog() {
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  String baseURL = "http://www.onlinestore.toolsqa.com" ;
		  driver.get(baseURL);
		  Reporter.log("Website Launched");
	  }

	  
	  @Test(priority=2)
	  public void ClosingReporterLog() {
		  driver.quit();
		  Reporter.log("Browser Closed");
	  }
}
