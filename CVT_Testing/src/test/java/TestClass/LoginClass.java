package TestClass;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM_Pages.DashboardPOM;
import POM_Pages.Login_POM;

public class LoginClass {

	public WebDriver driver;
	public Login_POM log;
	public DashboardPOM dash;
	public WebDriverWait wait;
	public ExtentReports extent;
	public ExtentTest test;

	public LoginClass(WebDriver driver, WebDriverWait wait, ExtentReports extent) {
		this.driver = driver;
		this.extent = extent;
		log = new Login_POM(driver);
		dash = new DashboardPOM(driver);
		this.wait = wait;

	}
	public LoginClass() {
	}

	public void LoginMethod() {

		test = extent.createTest("Test Method");
		wait.until(ExpectedConditions.visibilityOf(log.LoginDiv));
		String logdiv=log.LoginDiv.getScreenshotAs(OutputType.BASE64);
		test.log(Status.INFO, "Login Div Displayed");
		log.Username.sendKeys("admin@connectedservices.com");
		test.log(Status.INFO, "Username Entered");
		log.Password.sendKeys("SB2IVR25$!");
		test.log(Status.INFO, "Password Entered");
		log.LoginButton.click();
		test.log(Status.INFO, "Login button clicked");
		wait.until(ExpectedConditions.visibilityOf(dash.CVTLogo));
		if (dash.CVTLogo.isDisplayed()) {
			test.log(Status.INFO, "Dashboard navigated");
			String pass=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			test.log(Status.PASS, "Login Test Passed").addScreenCaptureFromBase64String(pass);
			Assert.assertTrue(true);
		} else {
			String fail=((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			test.log(Status.PASS, "Login Test Passed").addScreenCaptureFromBase64String(fail);
			test.log(Status.FAIL, "Login Test Failed");
			Assert.assertTrue(false);
		}

	}

}
