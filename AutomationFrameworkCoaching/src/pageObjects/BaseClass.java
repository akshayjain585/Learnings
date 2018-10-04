package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
static WebDriver dLocal;
public BaseClass(WebDriver dExternal)
{
	dLocal = dExternal;
}
	

//Naveen Automation Labs
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass() throws IOException{
		
		FileInputStream fis = new FileInputStream("/Users/akshayjain/Documents/workspace/AutomationFrameworkCoaching/src/utilities/Config.properties");
		prop.load(fis);
	}
	
	public void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "path");
		}else if(browserName.equalsIgnoreCase("Internet Explorer")){
			System.setProperty("webdriver.ie.driver", "path");
		}else{
			driver = new FirefoxDriver();
		}
		
	}
	
	

}
