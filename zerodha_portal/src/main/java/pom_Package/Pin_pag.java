package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_pag {
	
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement contine;
	
	public Pin_pag(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	
	public void pinclick() 
	{
		pin.sendKeys("221640");
		contine.click();
	}

}
