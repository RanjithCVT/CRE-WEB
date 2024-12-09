package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JanitorialPOM {

	public Login_POM login;
	public WebDriver driver;
	
	public JanitorialPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[contains(.,'+ ADD NEW RESOURCE')]")
	public WebElement AddNewResource;
	@FindBy(xpath="//input[@id='mat-input-4']")
	public WebElement Firstname;
	@FindBy(xpath="//input[@id='mat-input-5']")
	public WebElement Lastname;
	@FindBy(xpath="//input[@id='mat-input-6']")
	public WebElement PhoneNumber;
	@FindBy(xpath="//input[@id='mat-input-7']")
	public WebElement Email;
	@FindBy(xpath="//div[@id='mat-select-value-11']/span")
	public WebElement ClientDropdown;
	@FindBy(xpath= "///span[contains(text(),'Ross Dress For Less')]")
	public WebElement ClientSelected;
	@FindBy(xpath="//mat-option[@id='mat-option-215']")
	public WebElement PrimaryService;
	@FindBy(css ="css=.cdk-focused > .mdc-button__label")
	public WebElement Contractor;
	@FindBy(xpath="//div[@id='mat-select-value-13']")
	public WebElement AssignLocation;
	@FindBy(xpath="//mat-dialog-container[@id='mat-mdc-dialog-1']/div/div/app-new-employee/div/form/mat-dialog-actions/div/button/span[2]")
	public WebElement Submit;
	
	
	
	
	
	
	
}
