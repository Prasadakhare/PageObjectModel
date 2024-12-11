package testScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample_Iframe {
	public static final String expoutput = "java script";
  @Test
  public void iframemethod() throws IOException {
	  
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/autocomplete/");
		 driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).click();
//		txtbox.sendKeys("java Script");
//		txtbox.sendKeys(Keys.ENTER);
		
 List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
		 
		 for(WebElement item : items) {
			 //to select expected value
			 if(item.getText().equalsIgnoreCase(expoutput)) {
				 item.click();
				 break;
			 }
		 }
		
		 

		 
		 
  }
}
