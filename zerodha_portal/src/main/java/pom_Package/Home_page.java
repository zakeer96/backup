package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy (xpath="(//span[text()='Orders'])[1]") private WebElement orders;
	@FindBy (xpath="//span[text()='GTT']") private WebElement GTT;
	@FindBy (xpath="//span[text()='Baskets']") private WebElement Baskets;
	
	
	public Home_page(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	
	public void ordertab() 
	{
		
		orders.click();
		GTT.click();
		Baskets.click();
	}
	

}
