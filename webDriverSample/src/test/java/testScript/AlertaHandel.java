package testScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AlertaHandel{
  @Test
  public void variousAlert() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 //simple Alert
		 driver.findElement(By.id("alertBtn")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		//conferm alert
		 driver.findElement(By.id("confirmBtn")).click();
			Alert conferm=driver.switchTo().alert();
			System.out.println(conferm.getText());
			conferm.dismiss();
			
			//propmt alert
			 driver.findElement(By.id("alertBtn")).click();
				Alert prompt=driver.switchTo().alert();
				prompt.sendKeys("Hello World");
				System.out.println(prompt.getText());
				prompt.accept();
		
		
		
		
		
		 
		
		 
		 
		 
  }
}
