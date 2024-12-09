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
	
	@FindBy(xpath = "div[@class='col-md-3 mt-3 ng-star-inserted']//span[text()='Submit']")
	public WebElement SubmitButton;
	//
	
	
	
}
//