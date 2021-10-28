package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy (xpath="//input[@label='User ID']") private WebElement userID;
	@FindBy (xpath="//input[@type='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	
	public Login_page(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	
	public void signinZERODHA() 
	{
		userID.sendKeys("EF1495");
		password.sendKeys("@zakeer1786#");
		login.click();
	}

}
