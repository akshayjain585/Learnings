package com.ui.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ui.automation.baseClass.TestBase;

public class HomePage extends TestBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	static String btnValue ="//span[@class='nav-line-2' and text()='Your Orders']/span";
	static String linkSignOut="//span[text()='Sign Out']";
	
	public static void performSignOut()
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(btnValue))).build().perform();
		driver.findElement(By.xpath(linkSignOut)).click();
		
	}
}
