package testScript;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseAction {
	
  @Test
  public void f() {

		 WebDriver  driver  = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		Actions ac = new Actions(driver);
		
		 WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
		 
		 ac.moveToElement(btn).perform();
		 
		 WebElement txt = driver.findElement(By.id("field2"));
		 
		 ac.scrollToElement(txt).perform();
		 ac.moveToElement(btn).perform();
		 WebElement item2 = driver.findElement(By.linkText("Laptops"));
		 //ac.click(item2).perform();
		 ac.moveToElement(btn).click(item2).build().perform();
		 
		 //dragdrop
		 WebElement source = driver.findElement(By.id("draggable"));
		 WebElement Destination = driver.findElement(By.id("droppable"));
		 ac.dragAndDrop(source, Destination).build().perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	  
  }
}
