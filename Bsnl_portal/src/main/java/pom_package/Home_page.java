package pom_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Home_page {
	
	private  WebDriverWait driver1;
	
	@FindBy (xpath="(//span[text()='Recharge'])[1]") private WebElement recharge;
    @FindBy (xpath="//a[text()='GSM Prepaid ']") private WebElement GSM;
    @FindBy (xpath="//input[@id='mobileno']") private WebElement mobileno;
    @FindBy (xpath="//select[@id='circle']") private WebElement circle;
    @FindBy (xpath="//option[text()='Maharashtra']") private WebElement mh;
    @FindBy (xpath="//input[@id='shortname']") private WebElement nickname;
    @FindBy (xpath="//button[@id='form-button']") private WebElement submit;
    
	public Home_page(WebDriver driver1)
	{
		PageFactory.initElements(driver1,this);
	}
	

	public void clickonrecharge(WebDriver driver1) throws InterruptedException
	{
		recharge.click();
		Thread.sleep(2000);
		WebDriverWait wait= new WebDriverWait(driver1,30);
		WebElement gsm =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='GSM Prepaid ']")));	
		
		gsm.click();
		mobileno.sendKeys("8275032957");
		Thread.sleep(2000);
		circle.click();
		Thread.sleep(2000);
		mh.click();
		nickname.sendKeys ("aman");
		submit.click();
	}
	
}
