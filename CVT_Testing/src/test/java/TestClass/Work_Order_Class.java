package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM_Pages.SideMenuPOM;
import POM_Pages.Work_Order_POM;
import freemarker.core.UnexpectedTypeException;

public class Work_Order_Class {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public Work_Order_Class(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait=wait;
	}
	
	//wait.until(ExpectedConditions.visibilityOf();
	
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
		
		
	}
	
	
	
	
	

}
