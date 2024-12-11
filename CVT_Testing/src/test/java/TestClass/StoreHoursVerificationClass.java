package TestClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.google.common.collect.Table.Cell;

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

	public void StoreHoursVerify() throws FileNotFoundException {
//		wait.until(ExpectedConditions.visibilityOf(sidemenu.ManageLocations));
//		sidemenu.ManageLocations.click();
//		wait.until(ExpectedConditions.visibilityOf(location.SubmitButton));
//		location.LocationID.sendKeys("0055");
//		location.SubmitButton.click();
//		wait.until(ExpectedConditions.visibilityOf(location.LocationView));
//		location.LocationView.click();
//		wait.until(ExpectedConditions.visibilityOf(locDetails.LocationHeader));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", locDetails.HoursTable);
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//TestData//Store Hours verification sheet.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);

			Row row1 = sheet.getRow(1);
			int Columncount = row1.getLastCellNum();
			int rowCount = sheet.getLastRowNum();

			System.out.println("Row Count =" + rowCount);
			System.out.println("Column Count =" + Columncount);

			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < Columncount; j++) {
					Row row = sheet.getRow(i);
					String cell= row.getCell(j).toString();
					System.out.println(cell);
				}

			}

		}

		catch (Exception e) {

		}

	}

}
