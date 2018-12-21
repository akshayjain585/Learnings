package pages;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class LoginPage {
	

	public void additionalTrace(List<String> list1, List<String> list2){
		
		Set<String> set = new HashSet<String>();
		
		for(String key : list1){
			set.add(key);
		}
		
		for(String key1 : list2){
			if(!set.contains(key1)){
				System.out.println("Additional traces are "+key1);
			}
		}
	}
	
	public void missingTrace(List<String> list1, List<String> list2){
		
		Set<String> set = new HashSet<String>();
		
		for(String key : list2){
			set.add(key);
		}
		
		for(String key1 : list1){
			if(!set.contains(key1)){
				System.out.println("Missing traces are "+key1);
			}
		}
	}
	
	public void scroll(WebDriver driver) throws InterruptedException{
		JavascriptExecutor jx = (JavascriptExecutor)driver;
		for(int i=0; i<15; i++){
			jx.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			jx.executeScript("window.scrollBy(0,-250)");
		}
	}
	
}
