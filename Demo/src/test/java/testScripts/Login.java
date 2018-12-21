package testScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.LoginPage;

public class Login {
		
	LoginPage l1 = new LoginPage();
	
	@Test
	public void login() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Main\\Learnings\\Demo\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.hotstar.com");

		l1.scroll(driver);
		List<WebElement> traceB = driver.findElements(By.xpath("//a[@class='tray-link']"));
		int size1 = traceB.size();
		System.out.println("The size of traces without login is "+size1);
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(int i=0; i<size1; i++){
			String text = traceB.get(i).getText();
			list1.add(text);
		}
		
		driver.findElement(By.xpath("//div[text()='SIGN IN']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testprod-999@hotstar.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		l1.scroll(driver);
		List<WebElement> traceA = driver.findElements(By.xpath("//a[@class='tray-link']"));
		int size2 = traceA.size();
		System.out.println("The size of traces after login is "+size2);
		
		for(int i=0; i<size2; i++){
			String text = traceA.get(i).getText();
			list2.add(text);
		}
				
		l1.missingTrace(list1, list2);
		l1.additionalTrace(list1, list2);
		driver.quit();
		
	}

}
