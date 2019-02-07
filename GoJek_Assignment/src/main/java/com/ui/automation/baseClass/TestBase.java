package com.ui.automation.baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ui.automation.pages.HomePage;
import com.ui.automation.pages.LoginPage;

public class TestBase {
	
	public static WebDriver driver;
	
	static LoginPage loginPage;
	static HomePage homePage;
	
	
	
	public TestBase(WebDriver driver){
		this.driver = driver;
		this.loginPage = new LoginPage(driver);
		this.homePage = new HomePage(driver);
	}
	
	
	public void init(){
		System.setProperty("webdriver.gecko.driver", "D:\\Main\\Learnings\\GoJek_Assignment\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
}
