/*
Practice Exercise -7 (Drop Down Box/List)
1) Launch new Browser
2) Open “http://www.toolsqa.com/automation-practice-form/”
3) Select ‘Continents’ Drop down ( Use Id to identify the element )
4) Select option ‘Europe’ (Use selectByIndex)
5) Select option ‘Africa’ now (Use selectByVisibleText)
6) Print all the options for the selected drop down and select one option of your choice
7) Close the browser
 */

package practiceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeExercise7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-form/" ;
		driver.get(baseURL);
		
		Select oSelection = new Select(driver.findElement(By.id("continents")));
		oSelection.selectByIndex(1);
		Thread.sleep(2000);
		oSelection.selectByVisibleText("Africa");
		Thread.sleep(2000);
		
		List<WebElement> oSize = oSelection.getOptions();
		int iListSize = oSize.size();
		
		for(int i=0 ; i<iListSize ; i++){
			
			String sValue = oSelection.getOptions().get(i).getText();
			System.out.println(sValue);
			
			if(sValue.equals("Africa")){
				oSelection.selectByIndex(i);
				break;
			}
			
			driver.close();
		}	
		
	}

}
