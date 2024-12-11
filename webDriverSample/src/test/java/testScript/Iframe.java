package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframe {
  @Test
  public void window_iframe() {
	  WebDriver  driver  = new ChromeDriver();
	  driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/iframe");
		//WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
		
		 //switch to iframe
		driver.switchTo().frame(0);
		WebElement txt = driver.findElement(By.id("tinymce"));
		
		String input_text = txt.getText();
		System.out.println("The Sisplyed text is =" + input_text);
		
		
		driver.switchTo().defaultContent();
		
		WebElement link_Text = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
		link_Text.click();
		
		
		
		
		
		
		 
  }
}
