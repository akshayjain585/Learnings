/*Practice Exercise � 1

Launch a new Firefox browser.
Open Store.DemoQA.com
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if the it is a correct page opened
Get Page Source (HTML Source code) and Page Source length
Print Page Length on Eclipse Console.
Close the Browser.*/

package selenium_Learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		
	String PageTitle = driver.getTitle();
	int PageLength = driver.getTitle().length();
	
	System.out.println("The Page title is "+PageTitle+ " And the page length is "+PageLength );
	
	String currentURL = driver.getCurrentUrl();
	if(currentURL.equals(url)){
		System.out.println("The correct page is launched");
	}else{
		System.out.println("The wrong page is launched");
		System.out.println("Current URL: "+currentURL);
		System.out.println("Expected URL: "+url);
	}
	
	String pageSource = driver.getPageSource();
	int pageSourceLength = driver.getPageSource().length();
	
	System.out.println("The pagelength is "+pageSourceLength);
	
	driver.quit();
	
		
		

		
	}

}
