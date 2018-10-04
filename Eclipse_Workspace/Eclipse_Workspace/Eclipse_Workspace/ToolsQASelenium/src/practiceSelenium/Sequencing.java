package practiceSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sequencing {
  
  @Test
  public void firstMain() {
	  System.out.println("First main execution");
  }
  
  @Test
  public void secondMain() {
	  System.out.println("Second main execution");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will be executed before every method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will be executed after every method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will be executed before every class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This will be executed after every class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This will be executed before every test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This will be executed after every class");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This will be excuted before any test suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This will be executed after every test suite");
  }

}
