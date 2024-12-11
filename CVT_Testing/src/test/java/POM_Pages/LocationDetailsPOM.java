package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationDetailsPOM {
	
	public WebDriver driver;

	public LocationDetailsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
/*	@FindBy(xpath="")
	WebElement a;		*/
	
	@FindBy(xpath="//a[@title='BACK']")
	public WebElement BackButton;
	@FindBy(xpath="//div[@class='row']//h2[@class='mb0 mt5']")
	public WebElement LocationHeader;
	@FindBy(xpath="//h6[contains(text(), 'Hours of Operation for')]")
	public WebElement HoursOfOperation;
	@FindBy(xpath="//div[@class='table-responsive']")
	public WebElement HoursTable;
	@FindBy(xpath="//table[@class='table w100 doc_history']")
	public WebElement TableName;	
	
	

}
