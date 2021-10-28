package pom_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']") private WebElement signin;
	@FindBy (xpath="//input[@id='ap_email']") private WebElement userID;
	@FindBy (xpath="//input[@id='continue']") private WebElement continu;
	@FindBy (xpath="//input[@id='ap_password']") private WebElement password;
	@FindBy (xpath="//input[@id='signInSubmit']") private WebElement login;
	@FindBy (xpath="//span[text()='Sign Out']") private WebElement logout;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signinamazon() {
		signin.click();
		userID.sendKeys("baigzs086@gmail.com");
		continu.click();
		password.sendKeys("zsb1234");
		login.click();
	}

	public void signout(WebDriver driver)   {
		
		Actions act=new Actions(driver);
		act.moveToElement(signin).build().perform();
		act.moveToElement(logout).click().build().perform();
		
	}
}
