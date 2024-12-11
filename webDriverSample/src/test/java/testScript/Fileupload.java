package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;


public class Fileupload {
  @Test
  public void fileUpload() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
	String strPath = System.getProperty("user.dir")+"/webDriverSample/screenshots/1733822015320.png";
	
	addFile.sendKeys(strPath);
	
	WebElement startupload = driver.findElement(By.xpath("//span[text()='Start upload']"));
	
	startupload.click();
	driver.quit();
	
	 
	 
	
  }
}
