package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Libs {
    static WebDriver driver;
	public static WebDriver setBrowser()
	{
		switch(Config.browserName)
		{
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver", "D:\\chromedriver_win32\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		return driver;
	}
	
	public static void closeBrowser()
	{
		driver.close();
	}
	
	public static void captureScreen(String path,String testName) throws IOException
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		int randNumber = (int)(Math.random()*1000);
		FileUtils.copyFile(scr, new File(path+testName+randNumber+".png"));
	}
}
