package POM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPOM {
	public WebDriver driver;

	public DashboardPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(xpath = "//div[@class='logo']")
	public WebElement CVTLogo;
	@FindBy(xpath = "")
	public WebElement Username;
	@FindBy(xpath = "")
	public WebElement Password;
	@FindBy(xpath = "")
	public WebElement LoginButton;

}
