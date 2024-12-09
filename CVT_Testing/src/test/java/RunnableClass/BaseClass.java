package RunnableClass;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public WebDriver driver;
	public WebDriverWait wait;
	public ExtentReports extent ;
	public ExtentSparkReporter htmlreporter;
	

	@BeforeClass
	public void Startup() {
		extent=new ExtentReports();
		String Date=new SimpleDateFormat("yyyy-MM-dd__(HH.mm.ss)").format(new Date());
		String Reportname = "Report-"+Date+".html";
		htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"//ExtentReports//"+Reportname);
		extent.attachReporter(htmlreporter);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofMinutes(3));
		driver.get("http://sb2.connectedservices.com/sign-in");
		
	}

	@AfterClass
	public void Closure() {
		driver.close();
		extent.flush();
		
	}

}
