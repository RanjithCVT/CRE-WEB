package TestClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;

import POM_Pages.LocationDetailsPOM;
import POM_Pages.ManageLocationsPOM;
import POM_Pages.SideMenuPOM;

public class StoreHoursVerificationClass {

//	wait.until(ExpectedConditions.visibilityOf(

	public WebDriver driver;
	public ExtentReports extent;
	public WebDriverWait wait;
	public SideMenuPOM sidemenu;
	public ManageLocationsPOM location;
	public LocationDetailsPOM locDetails;

	public StoreHoursVerificationClass(WebDriver driver, WebDriverWait wait, ExtentReports extent) {
		this.driver = driver;
		this.extent = extent;
		this.wait = wait;
		sidemenu = new SideMenuPOM(driver);
		location = new ManageLocationsPOM(driver);
		locDetails = new LocationDetailsPOM(driver);

	}

	public void StoreHoursVerify() {
		wait.until(ExpectedConditions.visibilityOf(sidemenu.ManageLocations));
		sidemenu.ManageLocations.click();
		wait.until(ExpectedConditions.visibilityOf(location.SubmitButton));
		location.LocationID.sendKeys("0055");
		location.SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(location.LocationView));
		location.LocationView.click();
		wait.until(ExpectedConditions.visibilityOf(locDetails.LocationHeader));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", locDetails.HoursTable);

	}

}
