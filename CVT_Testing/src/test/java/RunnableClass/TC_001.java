package RunnableClass;

import org.testng.annotations.Test;

import TestClass.Janitorial;
import TestClass.LoginClass;

public class TC_001 extends BaseClass {

	// Login
	// Janitorial Creation

	@Test(priority = 0)
	public void LoginToTheApplication() {
		LoginClass login = new LoginClass(driver, wait, extent);
		login.LoginMethod();

	}

//	@Test(priority=1)
//	public void Janitorial_Creattion() {
//		Janitorial jani = new Janitorial(driver,wait);
//		jani.Janitorial_Creation();
//
//	}

}
