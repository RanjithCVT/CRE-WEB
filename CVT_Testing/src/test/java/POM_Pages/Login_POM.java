package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_POM {

	public WebDriver driver;

	public Login_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//div[@class='col-md-8 col-lg-6']")
	public WebElement LoginDiv;
	@FindBy(xpath = "//input[@id='mat-input-0']")
	public WebElement Username;
	@FindBy(xpath = "//input[@id='mat-input-1']")
	public WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement LoginButton;

}
