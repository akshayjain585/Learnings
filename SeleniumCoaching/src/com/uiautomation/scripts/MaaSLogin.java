package com.uiautomation.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MaaSLogin{

	public static WebDriver driver = null;
	public static Actions act = null;
	public static WebDriverWait wait = null;

	@BeforeTest()
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://m1.maas360.com/");
		driver.manage().window().maximize();
	}

	@Test()
	public void loginMaaS(){
		driver.findElement(By.name("EMail")).sendKeys("androidm1");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.name("Password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		boolean isDisplayed = driver.findElement(By.xpath("//div[@id='maas_help']//following-sibling::div[2]")).isDisplayed();
		Assert.assertEquals(isDisplayed, true);
	}

	@Test(dependsOnMethods={"loginMaaS"})
	public void deviceView() throws InterruptedException{
		//Actions act = new Actions(driver);
		wait = new WebDriverWait(driver,15);
		WebElement devices = driver.findElement(By.xpath("//li[@id='tabsmenu_listItem1']/child::a"));
		WebElement inventory = driver.findElement(By.xpath("//a[text()='Inventory']"));
		devices.click();
		wait.until(ExpectedConditions.visibilityOf(inventory));
		inventory.click();		
		driver.switchTo().frame(driver.findElement(By.id("Content")));
		driver.findElement(By.xpath("//div[@title='Device Name']")).click();
		driver.findElement(By.xpath("//input[@title='Enter Text' and @name='txtdevicename']")).sendKeys("jakshay-SM-J200G");
		driver.findElement(By.xpath("//input[@title='Enter Text' and @name='txtdevicename']/following-sibling::span")).click();
		WebElement view = driver.findElement(By.xpath("//span[text()='View']"));
		Thread.sleep(5000);
		view.click();
		//span[text()='MDM: Default Android MDM Policy (41)']
		
		boolean isMDMPolicy = driver.findElement(By.xpath("//span[text()='MDM: Default Android MDM Policy (41)']")).isDisplayed();
		boolean isPersonaPolocy = driver.findElement(By.xpath("//span[text()='WorkPlace Persona: CPS-29104 (3)']")).isDisplayed();
		
		Assert.assertEquals(isMDMPolicy, true);
		Assert.assertTrue(isPersonaPolocy, "Persona not available");
		System.out.println("Test Success");
	}
	
	@AfterTest()
	public void tearDown(){
		driver.quit();
	}

}
