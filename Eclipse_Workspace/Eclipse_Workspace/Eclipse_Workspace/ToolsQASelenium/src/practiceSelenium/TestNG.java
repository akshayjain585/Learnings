package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	public WebDriver driver ;
	
  @Test
  public void main() {
	  WebElement myAccount = driver.findElement(By.id("account"));
	  Assert.assertTrue(myAccount.isDisplayed());
	  myAccount.click();
	  driver.findElement(By.id("log")).sendKeys("testuser_1");
	  driver.findElement(By.id("pwd")).sendKeys("Test@123");
	  driver.findElement(By.id("login")).click();
	  System.out.println("Login Successfully");
	  driver.findElement(By.id("account_logout")).click();
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  String baseURL = "http://www.onlinestore.toolsqa.com" ;
	  driver.get(baseURL);
  }

  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
