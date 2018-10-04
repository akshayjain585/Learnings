package selenium_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//Using Implicit Wait(This will resume the script as soon as the page is loaded)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Using Explicit Wait(This will always wait for 5 secs even the page is loaded
		Thread.sleep(5000);
		
		driver.get("http://toolsqa.com/");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Getting total no. of links in WebPage
		System.out.println("The total no of links in WebPage is: "+driver.findElements(By.tagName("a")).size());
		
		
		//Getting total no. of links in particular column
		WebElement colLink = driver.findElement(By.cssSelector("#text-18"));
		System.out.println("The total no. of links in Column is: "+colLink.findElements(By.tagName("a")).size());
		
		
		//Clicking on "Contact US" link using For loop and verifying if the new tab is launched using its title
		for(int i=0; i<colLink.findElements(By.tagName("a")).size(); i++){
			
			
			if(colLink.findElements(By.tagName("a")).get(i).getText().contains("Contact US")){
				String ParentTitle = driver.getTitle();
				colLink.findElements(By.tagName("a")).get(i).click();
				String ChildTitle = driver.getTitle();
				if(ParentTitle != ChildTitle){
					System.out.println("PASS");
					System.out.println("Parent Title is "+ParentTitle +"Child Title is: "+ChildTitle);
				}
			
			}
			
			
		}
		
		

	}

}
