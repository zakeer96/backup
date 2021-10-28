package base_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
 
	public static WebDriver openchromebrowser() {
		System.setProperty("webdriver.chrome.driver",  "D:\\software testing\\selenium installation\\new crome driver file 1-10-21\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.bsnl.in/myportal/authorize.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	public static WebDriver openfirefoxebrowser()  {
		System.setProperty("webdriver.gecko.driver",  "D:\\software testing\\selenium installation\\new crome driver file 1-10-21\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://portal.bsnl.in/myportal/authorize.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}
}
