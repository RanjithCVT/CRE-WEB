package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.SideMenuPOM;
import POM_Pages.Work_Order_POM;

public class Work_Order_Class {

	public WebDriver driver;
	public WebDriverWait wait;

	public Work_Order_Class(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// wait.until(ExpectedConditions.visibilityOf());

	public void AddWorkOrder()
	{
		SideMenuPOM sidemenu = new SideMenuPOM(driver);
		Work_Order_POM workorder= new Work_Order_POM(driver);
		sidemenu.WorkOrders.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.Add_Work_Order));
		workorder.Add_Work_Order.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.Select_Service));
		workorder.Select_Service.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.Service_Options));
		workorder.Selectable_Service.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.Next_Button_home));
		workorder.Next_Button_home.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.SelectClientDropdown));
		wait.until(ExpectedConditions.elementToBeClickable(workorder.SelectClientDropdown));
		workorder.SelectClientDropdown.click();
		workorder.Client_name.click();
		wait.until(ExpectedConditions.elementToBeClickable(workorder.SelectLocationDropdown));
		workorder.SelectLocationDropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(workorder.SearchLocation_Textbox));
		workorder.SearchLocation_Textbox.sendKeys("0055");
		workorder.LocationID_Option.click();
		wait.until(ExpectedConditions.elementToBeClickable(workorder.SelectContractor_Dropdown));
		workorder.SelectContractor_Dropdown.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.ContractorName_Dropdown));
		workorder.ContractorName_Dropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(workorder.ExpirationDatePicker));
		workorder.ExpirationDatePicker.click();
		//wait.until(ExpectedConditions.elementToBeClickable(workorder.Calendar_View));
		wait.until(ExpectedConditions.elementToBeClickable(workorder.Date_in_Calendar));
		workorder.Date_in_Calendar.click();
		wait.until(ExpectedConditions.invisibilityOf(workorder.Calendar_View));
		wait.until(ExpectedConditions.elementToBeClickable(workorder.Next_button_Final));
		workorder.Next_button_Final.click();
		wait.until(ExpectedConditions.elementToBeClickable(workorder.Final_SubmitButton));
		workorder.Final_SubmitButton.click();
		wait.until(ExpectedConditions.visibilityOf(workorder.WorkorderTopSection));
		wait.until(ExpectedConditions.textToBePresentInElement(workorder.WorkorderTopSection, "Work Order Detail - WO"));
		String Workorder_Detail= (workorder.WorkOrderNumber.getText().toString());
		int index=Workorder_Detail.indexOf("-");
		String WO_Number=Workorder_Detail.substring(index+1);
		System.out.println("This is the Created Workorder Number :"+WO_Number);
		
	}

}
