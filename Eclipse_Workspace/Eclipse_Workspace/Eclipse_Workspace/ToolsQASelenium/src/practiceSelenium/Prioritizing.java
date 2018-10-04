package practiceSelenium;

import org.testng.annotations.Test;

public class Prioritizing {
	
  @Test(priority=1)
  public void two() {
	  System.out.println("two");
  }
  
  @Test(priority=1,enabled=false)
  public void four() {
	  System.out.println("four");
  }
  
  @Test(priority=0)
  public void one() {
	  System.out.println("one");
  }
  
  @Test(priority=2)
  public void three() {
	  System.out.println("three");
  }
  
}
