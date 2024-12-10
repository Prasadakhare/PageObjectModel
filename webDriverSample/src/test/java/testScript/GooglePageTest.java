package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest {
	
	WebDriver driver;
  @Test
  public void seleniumSearchTest() {
	  driver  = new ChromeDriver();
	  //driver.get("https://www.google.com/");
	 // driver.findElement(By.className("gLFyf"));                         Class_Name
	// WebElement  SearchBox = driver.findElement(By.id("APjFqb"));          //Using Id
	// driver.findElement(By.name("q")).sendKeys("Selenium Tutprial");     using name
    // SearchBox.sendKeys("Selenium Tutorial");
	 //SearchBox.sendKeys(Keys.ENTER);
	  
	// Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");  //pass
	// Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search Page");   //Test_Fail
	  
	  
	driver.get("https://testautomationpractice.blogspot.com/");	  
WebElement p=	driver.findElement(By.xpath("//table[@name='BookTable']//descendant::tr[2]/td[4]"));   
             

	
	  
	  
  }
}
