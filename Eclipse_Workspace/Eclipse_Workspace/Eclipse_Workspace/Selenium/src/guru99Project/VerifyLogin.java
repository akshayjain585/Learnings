package guru99Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String ActualTitle ;
		
		//Opening the URL
		driver.get(Util.Base_URL);
		
		driver.manage().timeouts().implicitlyWait(Util.WAIT_TIME,TimeUnit.SECONDS) ;
			
		//Clearing the Username textbox and inputting the Username (Always better to clear the textbox)
		 
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(Util.U_Name);
		
		// Clearing the Password textbox and inputting the Password (Always better to clear the textbox)

		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Util.Passwd);
		
		
		driver.findElement(By.name("btnLogin")).click();
		
		ActualTitle = driver.getTitle() ;
		
		//System.out.println(loginTitle);
		
		if (ActualTitle.equals(Util.Expected_Title)) {
			
			System.out.println("Login Successful : Test Case Passed");
			
		}
			else {
				
				System.out.println("Login Not Successful : Test Case Failed");
			}
		
		driver.close();
		
		}		
		
	}
