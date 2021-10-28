package pom_Package;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\software testing\\selenium installation\\new crome driver file 1-10-21\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		
		
//	WebElement signup=driver.findElement(By.xpath("//span[@class=\'nav-line-2 \']")); 
//	signup.click();
//	Actions act=new Actions(driver);
//	act.moveToElement(signup).click().build().perform();
//	act.contextClick().perform();
//	
	
//	act.click();
//	act.doubleClick();
//	act.moveToElement(null);
//	act.contextClick();
//	act.dragAndDrop(null, null);
//	act.build();
//	act.perform();
	
//		
//	WebElement createacc=driver.findElement(By.xpath("//a[@id=\'createAccountSubmit\']"));
//	createacc.click();
//	
//	WebElement yourname=driver.findElement(By.xpath("//input[@id=\'ap_customer_name\']"));
//	WebElement mobilenumber=driver.findElement(By.xpath("//input[@id=\'ap_phone_number\']"));
//	WebElement email=driver.findElement(By.xpath("//input[@id=\'ap_email\']"));
//	WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
//	WebElement continu=driver.findElement(By.xpath("//input[@id='continue']"));
//	yourname.sendKeys("zakeer");
//	mobilenumber.sendKeys("8275032957");
//	email.sendKeys("baigzs086@gmail.com");
//	password.sendKeys("Zaks@4321");
//	
//	continu.click();
		
		
		LocalDateTime d=java.time.LocalDateTime.now();
		System.out.println(d);

////		
	 String FileName = d.toString().replace(":", "_").replace(" ", "_");
////		
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("D:\\software testing\\screenshot\\image"+FileName+".jpg" );
	FileHandler.copy(source, dest);
//	
//	
//	
//	
	
	}

	}


