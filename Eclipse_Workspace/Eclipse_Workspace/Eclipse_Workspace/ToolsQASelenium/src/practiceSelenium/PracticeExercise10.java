/*
Practice Exercise 10
1) Launch new Browser
2) Open URL “http://www.toolsqa.com/automation-practice-table/”
3) Get the value from cell ‘Dubai’ with using dynamic xpath
4) Print all the column values of row ‘Clock Tower Hotel’
 */

package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeExercise10 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		String baseURL = "http://www.toolsqa.com/automation-practice-table/" ;
		driver.get(baseURL);
		
		String sRow = "1";
		String sCol = "2";
		
		String sCellValue = driver.findElement(By.xpath(".//*[@id='post-1715']/div/div/div/table/tbody/tr["+sRow+"]/td["+sCol+"]")).getText();
		System.out.println(sCellValue);
		
		String rowValue = "Clock Tower Hotel" ;
		for(int i=1 ; i<=5 ; i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id='post-1715']/div/div/div/table/tbody/tr["+i+"]/th")).getText();
			if(sValue.equalsIgnoreCase(rowValue)){
				for(int j=0 ; j<=5 ; j++){
					String colValue = driver.findElement(By.xpath(".//*[@id='post-1715']/div/div/div/table/tbody/tr[2]/td["+j+"]")).getText() ;
					System.out.println(colValue);
				}
				
				break;
			}
			
			driver.close();	
		}
	}

}
