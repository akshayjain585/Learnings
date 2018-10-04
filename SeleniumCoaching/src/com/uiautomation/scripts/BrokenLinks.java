package com.uiautomation.scripts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {
	
	public static void verifyURL(String urlLink) throws IOException{
		URL url = new URL(urlLink);
		HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
		httpConn.setConnectTimeout(5000);
		httpConn.connect();
		if(httpConn.getResponseCode()==200){
			System.out.println(urlLink +" is "+httpConn.getResponseMessage());
		}if(httpConn.getResponseCode()==401){
			System.out.println(urlLink +" is "+httpConn.getResponseMessage());
		}
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total number of links :"+allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++){
			
			String url = allLinks.get(i).getAttribute("href");
			verifyURL(url);
			
		}
		

	}

}
