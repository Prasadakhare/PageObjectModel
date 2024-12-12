package testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageLoadTest {
  @Test
  public void f() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();

		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 driver.get("http://uitestingplayground.com");
		 
		 driver.findElement(By.linkText("Load Delay")).click();
		 driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		 
		 
		 
  }
}
