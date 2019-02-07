package com.ui.automation.pages;

import org.openqa.selenium.By;

import com.ui.automation.baseClass.TestBase;
import com.ui.automation.utilities.Config;

public class LoginPage extends TestBase {
	
	LoginPage() {
		super(driver);
	}
	
	static String linkSignIn = "//span[text()='Hello, Sign in']";
	static String txtUsername = "email";
	static String btnContinue = "continue";
	static String txtPassword="password";
	static String txtPassword2 ="ap_password";
	static String btnSubmit= "signInSubmit";
	static String lblWelcomeName="//span[contains(text(),'Hello')]";

	
	public static HomePage enterUserDetails()
	{
		driver.findElement(By.xpath(linkSignIn)).click();
		driver.findElement(By.name(txtUsername)).sendKeys(Config.uname);
		driver.findElement(By.id(btnContinue)).click();
		driver.findElement(By.name(txtPassword)).sendKeys(Config.password);
		driver.findElement(By.id(btnSubmit)).click();
	
		//driver.findElement(By.id(txtPassword2)).sendKeys(Config.password);
		return homePage;
	}
	
	public static void clickOnLoginAfterCaptcha()
	{
		driver.findElement(By.id(btnSubmit)).click();
	}
	
	public static String getWelcomeName()
	{
		return driver.findElement(By.xpath(lblWelcomeName)).getText();
	}
}
