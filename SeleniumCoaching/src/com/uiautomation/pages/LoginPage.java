package com.uiautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends TestBaseClass{
	
	LoginPage(WebDriver driver){
		super(driver);
	}

	WebElement userName = driver.findElement(By.name("userName"));
	WebElement passWord = driver.findElement(By.name("password"));
	WebElement signIn = driver.findElement(By.name("login"));
	WebElement registerLink = driver.findElement(By.xpath("//a[text()='REGISTER']"));
	
	public void login(String uN, String pWd){
		
		if(userName.isDisplayed()){
			userName.sendKeys("mercury");
			passWord.sendKeys("mercury");
			signIn.click();
		}
		
	}

	

}
