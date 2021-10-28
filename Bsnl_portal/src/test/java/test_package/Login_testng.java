package test_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import base_package.Base_class;
import pom_package.Login_pag;

public class Login_testng extends Base_class {
	
	private WebDriver driver;
	private Login_pag login;
	
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
	public void beforeclass() {
		
	}
	
	
	@Test 
	public void logintes() {
		login=new Login_pag(driver);
	      login.signinBSNLportal();
	}
	
	@AfterClass
	public void afterclass()
	{		 
	//	driver.close();
	}
}
