package test_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base_package.Base_class;
import pom_Package.Home_page;
import pom_Package.Login_page;
import pom_Package.Pin_pag;

public class Home_testNG extends Base_class {
	
private WebDriver driver;
private Login_page login;
private Pin_pag pinid;
private Home_page order;
	
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
//	@BeforeClass
//	public void beforeclass()
//	{
//		 
//	}	
	
	@BeforeMethod
	public void  beforemethod() {
		login=new Login_page(driver);
		
		 pinid= new Pin_pag(driver);
		
		 order= new Home_page(driver);
	}
	@Test	
	public void ordertab()
	{
		login.signinZERODHA();
		pinid.pinclick();
	    order.ordertab();
	
	}	
	@AfterMethod
	public void aftermethod()
	{
		Login_page login=null;
		Pin_pag pinid= null;
		System.gc();
	}	

	

}
