package testScript;

import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocotors {
  @Test
  public void f() {

		 WebDriver  driver  = new ChromeDriver();
		 driver.get("https://automationbookstore.dev/");
		 String strid = driver.findElement(with(By.tagName("li")).toLeftOf(By.id("pid6")).below(By.id("pid1"))).getAttribute("id");
		 System.out.println(strid);
  }
}
