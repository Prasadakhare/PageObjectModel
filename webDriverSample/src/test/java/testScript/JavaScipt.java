package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScipt {
  @Test
  public void f() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
      driver.get(" https://ecommerce-playground.lambdatest.io/");
	  
	 
  }
}
