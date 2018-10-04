/*
Practice Exercise -8 (Multiple Selection Box/List)
1) Launch new Browser
2) Open “http://www.toolsqa.com/automation-practice-form/”
3) Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
4) Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
5) Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
6) Print and select all the options for the selected Multiple selection list.
7) Deselect all options
8) Close the browser
 */

package practiceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-form/" ;
		driver.get(baseURL);
		
		Select oSelection = new Select(driver.findElement(By.name("selenium_commands")));
		oSelection.selectByIndex(1);
		Thread.sleep(2000);
		oSelection.deselectByIndex(1);
		
		oSelection.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oSelection.deselectByVisibleText("Navigation Commands");
		
		List oSize = oSelection.getOptions();
		int iListSize = oSize.size();
		
		for(int i =0 ; i<iListSize ; i++){
			String sValue = oSelection.getOptions().get(i).getText();
			System.out.println(sValue);
			oSelection.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		oSelection.deselectAll();
		
		driver.close();
	}

}
