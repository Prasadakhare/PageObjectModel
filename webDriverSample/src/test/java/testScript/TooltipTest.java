package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TooltipTest {
  @Test
  public void tooltip() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get(" https://jqueryui.com/autocomplete/");
	  Actions action = new Actions(driver);
	  driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
	  driver.findElement(By.id("age")).sendKeys(Keys.ARROW_DOWN);
	  action.moveToElement(driver.findElement(By.id("age"))).perform();


  }
}
