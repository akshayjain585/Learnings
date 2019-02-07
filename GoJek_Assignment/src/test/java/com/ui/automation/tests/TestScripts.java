package com.ui.automation.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ui.automation.baseClass.TestBase;
import com.ui.automation.pages.HomePage;
import com.ui.automation.pages.LoginPage;
import com.ui.automation.utilities.Config;

public class TestScripts extends TestBase {
	
	public TestScripts() {
		super(driver);
	}
	
	TestBase tb;
//	
//	@BeforeClass
//	public void start(){
//		tb = new TestBase(driver);
//	}
	
	@BeforeSuite
	public void init(){
		tb = new TestBase(driver);
		tb.init();
	}
	
	@Test
	public void login() throws InterruptedException{
		
		driver.get(Config.baseUrl);
		LoginPage.enterUserDetails();
	//	Thread.sleep(10000); //explicit wait to enter captcha manually
		//LoginPage.clickOnLoginAfterCaptcha();

		assertTrue((LoginPage.getWelcomeName()).equals("Hello, Dummy"));
	}
	
	@Test
	public void signOut()
	{
		HomePage.performSignOut();
	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();
	}

	
	

}
