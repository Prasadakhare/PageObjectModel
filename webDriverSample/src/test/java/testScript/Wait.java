package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Wait {
  @Test
  public void f() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get("http://uitestingplayground.com/ajax");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.findElement(By.id("ajaxButton")).click();
		 
		 
		WebElement text =driver.findElement(By.cssSelector("div#content"));
		 wait.until(ExpectedConditions.textToBePresentInElement(text,"Data loaded with AJAX get request."));
		 
		 WebElement elem = driver.findElement(By.cssSelector("p.bg-success"));
		 String strTxt = elem.getText();
		 
		 Assert.assertEquals(strTxt, "Data loaded with AJAX get request.");
		 
		 System.out.println(strTxt);
		 
		 
		 
		 
	
		 
		 
	  
	  
	  
	  
  }
}
