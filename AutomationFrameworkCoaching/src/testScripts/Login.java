package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import utilities.Config;

public class Login {
   static WebDriver driver;
	@BeforeMethod
	public void lauchBrowser() throws IOException
	{
		driver = utilities.Libs.setBrowser();
		new BaseClass(driver);
		driver.get(Config.baseUrl);
		utilities.ExcellOprations.setFilePath(Config.testDataPath, "Login");
	}
	@AfterMethod
	public void terminateBrowser()
	{
		utilities.Libs.closeBrowser();
	}
	@Test
  public void loginTest() throws IOException 
	{
		String userName,passwrod;
		userName = utilities.ExcellOprations.getCellValue(1, 0);
		passwrod = utilities.ExcellOprations.getCellValue(1, 1);
		pageObjects.LoginPage.setUserName(userName);
		pageObjects.LoginPage.setPassword(passwrod);
		pageObjects.LoginPage.btnLogin();
		Assert.assertTrue(driver.findElement(By.linkText("SIGN-OFF")).isDisplayed());
		Reporter.log("Login is successfull");
		utilities.Libs.captureScreen(Config.testFailurePath, "Login");
  }
}
