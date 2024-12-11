package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedioButton {
	
  @Test
  public void rediobutton() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  //rediobutton
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.findElement(By.id("male")).click();
  }
}
