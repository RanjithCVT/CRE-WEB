package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SideMenuPOM {

	public WebDriver driver;

	public SideMenuPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	/*
	 * @FindBy(xpath="") WebElement 1;
	 */

	@FindBy(xpath = "//li[@class='ng-star-inserted']//a[@title='Manage Locations']")
	public WebElement ManageLocations;

	@FindBy(xpath = "//li[@class='ng-star-inserted']//a[@title='Work Orders']")
	public WebElement WorkOrders;

}
