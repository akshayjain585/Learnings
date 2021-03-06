package selenium_Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.os.WindowsUtils;

public class All_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Closing any application from task manager using WindowsUtils class
		WindowsUtils.tryToKillByName("notepad.exe");
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.amazon.in/");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[2]"))).build().perform();
		ac.keyDown(Keys.SHIFT).moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).sendKeys("allsmall").build().perform();
		ac.keyDown(Keys.SHIFT).moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).sendKeys("allsmall").build().perform();
		
	
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().alert();
		driver.switchTo().window("sdsd");
		driver.getWindowHandle();
		
		
		
//Using Alert class to handle popups		
		/*driver.get("https://www.goindigo.in/");
		Alert al = driver.switchTo().alert();
		al.dismiss();*/
		
		
//Using Select Class for drop-down
	    /*driver.get("https://www.goindigo.in/");
		WebElement address = driver.findElement(By.xpath("//input[@class='origins-value']"));
		Select obj = new Select(address);
		obj.selectByIndex(2);
		driver.findElement(By.xpath("//input[@class='destinations-value']"));
		obj.selectByIndex(4);*/
		

		
		
		
		
		
		
		
		
		

	}

}
