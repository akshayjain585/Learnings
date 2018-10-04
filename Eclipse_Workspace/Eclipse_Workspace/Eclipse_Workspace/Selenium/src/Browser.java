import org.openqa.selenium.ie.InternetExplorerDriver;

/*
 * This program shows How to use different browsers for automating the application like Internet Explorer and Google chrome, where we need to set the system property.
 */

public class Browser {

	public static void main(String[] args) {
		
		/*
		 * To use IE and GoogleChrome, we need to set the system property of this browser
		 */
		
		/*System.setProperty("webdriver.ie.driver","D:\\Akshay\\Softwares\\Selenium\\IEDriverServer_x64_2.42.0\\IEDriverServer.exe"); */ 
		
		//OR to remove the hardcoded path dependency, create a folder in your project, get the project path and browser path from eclipse
		
		String name = System.getProperty("user.dir"); //This will give the current path of the project
		
		/*System.out.println(System.getProperty("user.dir"));*/
		
		System.setProperty("webdriver.ie.driver",name+"//IEDriver//IEDriverServer.exe");  //getting the project path from name variable and appending the IE browser path

		InternetExplorerDriver dr1 = new InternetExplorerDriver();  //Creating the object of InternetExplorerDriver class
		
		dr1.get("http://gmail.com");	
		

	}

}


