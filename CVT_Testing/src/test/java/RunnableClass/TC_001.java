package RunnableClass;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import TestClass.LoginClass;
import TestClass.StoreHoursVerificationClass;

public class TC_001 extends BaseClass {

	// Login
	// Janitorial Creation

//	@Test(priority = 0)
//	public void LoginToTheApplication() {
//		LoginClass login = new LoginClass(driver, wait, extent);
//		login.LoginMethod();
//
//	}

//	@Test(priority=1)
//	public void Janitorial_Creattion() {
//		Janitorial jani = new Janitorial(driver,wait);
//		jani.Janitorial_Creation();
//
//	}

	@Test
	public void StoreHoursVerification() throws FileNotFoundException {
		StoreHoursVerificationClass storehoursvfy = new StoreHoursVerificationClass(driver, wait, extent);
		storehoursvfy.StoreHoursVerify();

	}

}
