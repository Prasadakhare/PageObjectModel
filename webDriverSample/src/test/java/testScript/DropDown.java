package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

  @Test
  public void dropdowun() {
	
		 WebDriver  driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 Select sc = new Select(driver.findElement(By.id("country")));
		 
		 //sc.selectByValue("uk");
		 //sc.selectByIndex(8);
		 sc.selectByVisibleText("India");
		 
		 
		 
		 
		 
		 
  }
}
