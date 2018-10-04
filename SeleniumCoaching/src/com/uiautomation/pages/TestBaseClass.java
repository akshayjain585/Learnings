package com.uiautomation.pages;

import org.openqa.selenium.WebDriver;

public class TestBaseClass {
	
	static WebDriver driver;
	
	TestBaseClass(WebDriver driver){
		this.driver = driver;
	}

}
