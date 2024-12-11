package testScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWindowHandel {
  @Test
  public void windowhandle() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 //parant Window
		 String parant = driver.getWindowHandle();
		 driver.findElement(By.xpath("//button[contains(text(),'New Tab')]")).click();
		 System.out.println(parant);
		 System.out.println("Title of the page is "+driver.getTitle());
		 
		 Set<String> windowhandel = driver.getWindowHandles();
		 System.out.println(windowhandel.size());
		 //go to child window
		 for(String child:windowhandel) {
			 if(!child.equalsIgnoreCase(parant)) {
				 driver.switchTo().window(child);
				System.out.println(driver.getTitle()); 
			 }
			 
		 }
		 
		 //switch window handle to parant window	 
		 driver.switchTo().window(parant);
		 
		 
		 //close the current window
		 //driver.close();
		 
		 
		 //close the current browser
		 driver.quit();
		 
		 
		 
		 
		 
		 
	
	  
  }
}
