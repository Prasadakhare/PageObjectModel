package testScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isDisplayed {
	WebDriver driver;
  @Test
  public void displayElement() throws IOException {
	  driver  = new ChromeDriver();
	  
	  driver.get("https://automationbookstore.dev/");
	  
	  //Entire page ScreShot
	  TakesScreenshot  screen = (TakesScreenshot)driver;
	File src= screen.getScreenshotAs(OutputType.FILE);
	String path=System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
	FileUtils.copyFile(src,new File(path));
	
	
	  
	
	  
	  
  }
  
}
