package test_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base_package.Base_class;
import pom_Package.Login_page;
import pom_Package.Pin_pag;
import pom_Package.Search_class;

public class Login_testNG extends Base_class{

    private WebDriver driver;
	private Login_page login;
	private Pin_pag pinid;
	private Search_class search;
	
	@BeforeTest
	@Parameters ("browser")
	public void beforeTest(String browser) throws InterruptedException  {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=openchromebrowser(); 
		}
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver=openfirefoxebrowser(); 
		}
		
		Thread.sleep(3000);
	}
	@BeforeClass
	public void beroreclass(){
		login=new Login_page(driver);
		pinid=new Pin_pag(driver); 
		search=new Search_class(driver);
	}
		
	@Test (priority=0)
	public void logintest() {
		 
		login.signinZERODHA();
		pinid.pinclick();
		search.searchShare();
		search.BuyShare(driver);
	}	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("end");
	}
		
}
