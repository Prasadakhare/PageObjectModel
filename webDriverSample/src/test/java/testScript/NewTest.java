package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class NewTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;
	
	@BeforeTest
	public void setUpExtent() {
		extentReports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html")
				.viewConfigurer()
				.viewOrder()
			   	.as(new ViewName[]{
			ViewName.DASHBOARD,
			ViewName.TEST,
			ViewName.AUTHOR,
			ViewName.DEVICE,
			ViewName.LOG
			
		}).apply();
		extentReports.attachReporter(spark);
		
	}
	@BeforeMethod
	public void setupExtent() {
       driver= new ChromeDriver();	
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		extentTest.assignAuthor("AutomationTestOne")
		.assignDevice("RegressionTesting")
		.assignDevice(System.getProperty("os.name"))
		.assignDevice(System.getProperty("os.version"));
		
		if(ITestResult.FAILURE==result.getStatus()) {
			extentTest.log(Status.FAIL, result.getThrowable().getMessage());
			String strpath= Utility.getScreenshotPath(driver);
			extentTest.fail(
					MediaEntityBuilder.createScreenCaptureFromPath(strpath).build());
			
		}
		driver.close();
	}
	@AfterTest
		public void finishExent() {
			extentReports.flush();
		}
	
  @Test
  public void SeleniumSearch() {
	  extentTest = extentReports.createTest("Selenium Search Test");
	  driver.get("https://www.google.com/");
		 WebElement SearchBox= driver.findElement(By.className("gLFyf"));                     
		
	    SearchBox.sendKeys("selenium");
		SearchBox.submit(); 
		String title = driver.getTitle();
		Assert.assertEquals(title, "selenium - Google Search");
  }
}


















