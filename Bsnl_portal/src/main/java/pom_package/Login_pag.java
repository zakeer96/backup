package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pag {
	@FindBy (xpath="//input[@id='username']") private WebElement username;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@id='login-btn']") private WebElement signin;
	
	public Login_pag(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	
	public void signinBSNLportal() 
	{
		username.sendKeys("zakeer86");
		password.sendKeys("zakeer2009");
		signin.click();
	}
}
