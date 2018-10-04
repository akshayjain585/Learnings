/*Practice Exercise -2 (Multiple Selection Box/List)

Launch new Browser
Open “http://toolsqa.wpengine.com/automation-practice-form/”
Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
Print and select all the options for the selected Multiple selection list.
Deselect all options
Close the browser*/

package selenium_Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		driver.manage().window().maximize();

		WebElement toRecognize = driver.findElement(By.id("selenium_commands"));
		Select oselect = new Select(toRecognize);

		oselect.selectByIndex(0);
		Thread.sleep(3000);
		oselect.deselectByIndex(0);

		oselect.selectByVisibleText("Navigation Commands");
		Thread.sleep(3000);
		oselect.deselectByValue("Navigation Commands");

		List<WebElement> drpSize = oselect.getOptions();
		for(int i=0; i<drpSize.size(); i++){
			String sval = oselect.getOptions().get(i).getText();
			System.out.println(sval);
			oselect.selectByIndex(i);
		}
		oselect.deselectAll();
		//driver.quit();


	}

	
}
