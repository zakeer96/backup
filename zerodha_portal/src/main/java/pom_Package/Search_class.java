package pom_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Search_class {
	
	@FindBy (xpath="//input[@icon='search']") private WebElement search;
    @FindBy (xpath="(//span[text()='TATAMOTORS'])[1]") private WebElement tatamotors;
    @FindBy (xpath="//button[@data-balloon='Buy']") private WebElement buy;
	public Search_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchShare()
	{
		search.click();
		search.sendKeys("tata");
		
	}
public void BuyShare(WebDriver driver)   {
		
		Actions act=new Actions(driver);
		act.moveToElement(tatamotors).build().perform();
		act.moveToElement(buy).click().build().perform();
		
	}
	
}
