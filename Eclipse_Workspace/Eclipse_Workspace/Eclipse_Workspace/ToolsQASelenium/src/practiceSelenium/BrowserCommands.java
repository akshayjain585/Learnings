/*
Practice Exercise
1) Launch a new Firefox browser.
2) Open ToolsQA.com
3) Get Page Title name and Title length
4) Print Page Title and Title length on the Eclipse Console.
5) Get Page URL and URL length
6) Print URL and URL length on the Eclipse Console.
7) Refresh current page
8) Get Page Source (HTML Source code) and Page Source length
9) Print Page Source and length on Eclipse Console.
10) Close the Browser.
 */

package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		String baseURL = "http://www.toolsqa.com" ;
		
		driver.get(baseURL);
		
		String pageTitle = driver.getTitle();
		int titleLength = driver.getTitle().length();
		
		System.out.println("The Page title and page length is " + pageTitle + "and" + titleLength);
		
		String pageURL = driver.getCurrentUrl();
		int pageURLLength = driver.getCurrentUrl().length();
		
		System.out.println("The Page URL and page URL length is " + pageURL + "and" + pageURLLength);
		
		driver.navigate().refresh();
		
		String pageSource = driver.getPageSource();
		int lengthPageSource = driver.getPageSource().length();
		
		System.out.println("The Page Souce and page source length is " + pageSource + "and" + lengthPageSource);
		
		driver.quit();	

	}

}
