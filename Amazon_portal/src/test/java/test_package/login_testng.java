package test_package;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base_package.Base_class;
import pom_package.Login_page;


public class login_testng extends Base_class {
	
	private WebDriver driver;
	private Login_page login;
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser)  {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=openchromebrowser(); 
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=openfirefoxebrowser(); 
		}				
	}
	@BeforeClass
	public void beroreclass(){
		 login=new Login_page(driver);
		 	
	}
	
	@Test 
	public void logintest() {
		 
		login.signinamazon();
		
		login.signout(driver);
      }
}
