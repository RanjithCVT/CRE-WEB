package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLocationsPOM {

	public WebDriver driver;

	public ManageLocationsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
//	@FindBy(xpath="//div[@class='col-md-3 mt-3 ng-star-inserted']//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple']")
//	WebElement SubmitButton;
	
	/*	@FindBy(xpath="")
		WebElement 1;
		
	 	*/  
	
	
	
	@FindBy(xpath="//input[@name='storeId']")
	public WebElement LocationID;
	@FindBy(xpath="//mat-select[@name='company']")
	public WebElement ClientDropdown ; 
	@FindBy(xpath = "//div[@class='col-md-3 mt-3 ng-star-inserted']//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple']")
	public WebElement SubmitButton;
	@FindBy(xpath="//div[@class='col-md-3 mt-3 ng-star-inserted']//span[text()='Clear']")
	public WebElement ClearButton;	
	@FindBy(xpath="(//a[@title='View'])[1]")
	public WebElement LocationView;
	 
	
	
	
	
	
}
//