package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	WebDriver driver;
  @Test
  public void seleniumTest() {
	  
	  driver  = new ChromeDriver();
	  
	 //.get("http://the-internet.herokuapp.com/login");
//	  driver.findElement(By.id("username")).sendKeys("tomsmith");                                  //Id
//	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SuperSecretPassword!");   //xpath
//	  driver.findElement(By.className("radius")).click();
//	  driver.findElement(By.linkText("Elemental Selenium")).click();
//	  driver.findElement(By.partialLinkText("Elemental")).click();
	 driver.get("https://www.lambdatest.com/blog/");
	 //System.out.println(driver.findElement(By.xpath("//p[contains(text(),'ENGAGE')]")));
	 
	 driver.findElement(By.xpath("//p[@class='header_heading' and text()='ENTERPRISE']"));
	 
	 
	  
	  
	  
	  
  }
}
