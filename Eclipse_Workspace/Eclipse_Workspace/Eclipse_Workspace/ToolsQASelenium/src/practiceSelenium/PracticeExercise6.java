/*
Practice Exercise 6
1) Launch new Browser 
2) Open “http://www.toolsqa.com/automation-practice-form/” 
3) Select the deselected Radio button (female) for category Sex (Use IsSelected method) 
4) Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button) 
5) Check the checkbox ‘Automation Tester’ for category ‘Profession’( Use Value attribute to match the selection) 
6) Check the checkbox ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
*/

package practiceSelenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise6 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String baseURL = "http://www.toolsqa.com/automation-practice-form/" ;
		driver.get(baseURL);
		
		//Step3 :- Using isSelected method to select the Radiobutton
		List <WebElement> oRadioButton = driver.findElements(By.name("sex"));
		boolean bvalue = false ;
		bvalue = oRadioButton.get(0).isSelected();
		if(bvalue = true){
			oRadioButton.get(1).click();
		}else{
			oRadioButton.get(0).click();
		}
		
		
		//Step4 :- Using ID attribute to select the RadioButton
		WebElement oRadioButton1 = driver.findElement(By.id("exp-2"));
		oRadioButton1.click();
		
		
		//Step5 :- Using Value to select the checkbox
		List <WebElement> oCheckBox = driver.findElements(By.name("profession"));
		int isize = oCheckBox.size();
		for(int i=0 ; i<isize ; i++){
			String sValue = oCheckBox.get(i).getAttribute("Value");
			if(sValue.equalsIgnoreCase("Automation Tester"));
			oCheckBox.get(i).click();
			break ;
		}
		
	
		//Step6 : Using CSS selector tag[attribute=value] 
		driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
		
		driver.close();

	}

}
