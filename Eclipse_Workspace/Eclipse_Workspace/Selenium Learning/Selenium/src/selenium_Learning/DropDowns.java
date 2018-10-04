/*Practice Exercise -1 (Drop Down Box/List)

Launch new Browser
Open �http://toolsqa.wpengine.com/automation-practice-form/�
Select �Continents� Drop down ( Use Id to identify the element )
Select option �Europe� (Use selectByIndex)
Select option �Africa� now (Use selectByVisibleText)
Print all the options for the selected drop down and select one option of your choice
Close the browser*/

package selenium_Learning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(URL);
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("continents"));
		Select oselect = new Select(dropdown);
		oselect.selectByIndex(3);

		Thread.sleep(2000);
		oselect.selectByVisibleText("Africa");

		List<WebElement> drpsize = oselect.getOptions();
		for(int i=0; i<drpsize.size(); i++){
			String sval = oselect.getOptions().get(i).getText();
			System.out.println(sval);
			if(sval.equals("Antartica")){
				oselect.selectByIndex(i);
				break;
			}
		}
		driver.quit();

	}

}
