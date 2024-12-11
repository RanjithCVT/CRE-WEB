package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.JanitorialPOM;
import POM_Pages.SideMenuPOM;

public class Janitorial {
	public WebDriver driver;
	public WebDriverWait wait;
	// Janitorial creation Perform WO
	// Janitorial Updation

	public Janitorial(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait=wait;

	}

	public void Janitorial_Creation() {
		LoginClass login = new LoginClass();
		SideMenuPOM side = new SideMenuPOM(driver);
		JanitorialPOM jani = new JanitorialPOM(driver);
		//side.ManageResources.click();
		wait.until((ExpectedConditions.visibilityOf(jani.AddNewResource)));
		jani.AddNewResource.click();
		wait.until(ExpectedConditions.visibilityOf(jani.Firstname));
		jani.Firstname.sendKeys("Testlll");
		jani.Lastname.sendKeys("LastName");
		jani.PhoneNumber.sendKeys("9876543210");
		jani.Email.sendKeys("penkn@yopmail.com");
		jani.ClientDropdown.click();
		jani.ClientSelected.click();

	}

}
