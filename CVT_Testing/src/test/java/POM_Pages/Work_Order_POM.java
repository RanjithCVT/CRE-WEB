package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Work_Order_POM {

	public WebDriver driver;

	public Work_Order_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	/*
	 
	 @FindBy(xpath="")
	  public WebElement 1;
	  
	 */

	 @FindBy(xpath="//li[@class='ng-star-inserted']//a[@title='schedule']")
	  public WebElement Add_Work_Order;
	 @FindBy(xpath="//span[text()='-- Select a service * --']")
	  public WebElement Select_Service;
	 @FindBy(xpath="//div[@role='listbox']")
	  public WebElement Service_Options;
	 @FindBy(xpath="//span[text()=' Bio-Hazard ']")
	  public WebElement Selectable_Service;
	 @FindBy(xpath="//div[@class='mt25 text-center']//span[text()='Next']")
	  public WebElement Next_Button_home;
	 @FindBy(xpath="//span[text()='Select Client *']")
	  public WebElement SelectClientDropdown;
	 @FindBy(xpath="//span[text()='Select Location *']")
	  public WebElement SelectLocationDropdown;
	 @FindBy(xpath="//span[text()='Select Contractor']")
	  public WebElement SelectContractor_Dropdown;
	 @FindBy(xpath="//input[@data-mat-calendar='mat-datepicker-2']")
	  public WebElement ExpirationDatePicker;
	 @FindBy(xpath="//div[@class='mat-calendar-content']")
	  public WebElement Calendar_View;
	 @FindBy(xpath="//button[@type='button']//span[text()=' 30 ']")
	  public WebElement Date_in_Calendar;
	 @FindBy(xpath="(//span[text()='Next'])[2]")
	  public WebElement Next_button_Final;
	 @FindBy(xpath="//span[text()='Ross Dress For Less']")
	  public WebElement Client_name;
	 @FindBy(xpath="//input[@placeholder='Search Location']")
	  public WebElement SearchLocation_Textbox;
	 @FindBy(xpath="(//mat-option[@role='option'])[2]")
	  public WebElement LocationID_Option;
	 @FindBy(xpath="//mat-option[@role='option']//span[text()='Complete Cleaning Service (Demo)']")
	  public WebElement ContractorName_Dropdown;
	 @FindBy(xpath="//span[text()='Submit']")
	  public WebElement Final_SubmitButton;
	 
	
	 
	 
	 
	
	
}
