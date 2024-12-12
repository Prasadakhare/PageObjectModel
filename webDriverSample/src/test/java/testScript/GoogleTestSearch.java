package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestSearch {
	WebDriver  driver;
	

	//@BeforeMethod
	@BeforeTest
	public void close() {
		  driver  = new ChromeDriver();
		  driver.manage().window().maximize();
	}
	//@AfterMethod
	@AfterTest
	public void setUp() {
		driver.close();
	}
	
  @Test(priority=1)
  public void javaTutorial() throws InterruptedException {
	 
		 driver.get("https://www.google.com/");
		 WebElement search = driver.findElement(By.id("APjFqb"));
		 search.sendKeys("Java Tutorial");
		 search.submit();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
  }
  @Test(priority=3)
  public void seleniumTutorial() throws InterruptedException {

		 driver.get("https://www.google.com/");
		 WebElement search = driver.findElement(By.id("APjFqb"));
		 search.sendKeys("Selenium Tutorial");
		 search.submit();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");

  }
  
  @Test(priority=2)
  public void cucumberTutorial() throws InterruptedException {

		 driver.get("https://www.google.com/");
		 WebElement search = driver.findElement(By.id("APjFqb"));
		 search.sendKeys("Cucumber Tutorial");
		 search.submit();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");

  }
  
  
  @Test
  public void appiumTutorial() throws InterruptedException {

		 driver.get("https://www.google.com/");
		 WebElement search = driver.findElement(By.id("APjFqb"));
		 search.sendKeys("Appium Tutorial");
		 search.submit();
		 Thread.sleep(2000);
		 Assert.assertEquals(driver.getTitle(), "Appium Tutorial - Google Search");

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
