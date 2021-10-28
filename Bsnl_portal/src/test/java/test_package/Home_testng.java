package test_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import base_package.Base_class;
import pom_package.Home_page;
import pom_package.Login_pag;
import test_utils.Utility;

public class Home_testng extends Base_class {
	private WebDriver driver;
	private Home_page recharge;
	private Login_pag login;
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser)   {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=openchromebrowser(); 
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=openfirefoxebrowser(); 
		}
	}
	
	@BeforeMethod 
	public void logintest() {
	   login=new Login_pag(driver);
	    login.signinBSNLportal();
	}
	
	@Test 
	public void racharge() throws IOException, InterruptedException {
		
		//wait.waitexplicit(driver);
		recharge=new Home_page(driver);
		recharge.clickonrecharge(driver);
	    Utility.captureScreenShot(driver);
	    Utility.fetchDataFromExcelSheet(0,0);
	    
	}

}
