package Tasks.Parry_Hotter_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisplayWeb {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//display homepage
		//driver.get("https://danube-webshop.herokuapp.com/");         
	}
  @Test
  public void signup() throws InterruptedException {
	  
	  driver.findElement(By.id("signup")).click();
	  
    
    		 driver.findElement(By.id("s-name")).sendKeys("Prasad");
	  driver.findElement(By.id("s-surname")).sendKeys("Akhare");
	  driver.findElement(By.id("s-email")).sendKeys("akhareprasad77@gmail.com");
	  driver.findElement(By.id("s-password2")).sendKeys("Prasad@123");
	 
	  //Radio Button
	  driver.findElement(By.id("myself")).click();
	  driver.findElement(By.id("marketing-agreement")).click();	  
	  driver.findElement(By.id("privacy-policy")).click();
	  
	  //Register Button
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     
	     WebElement model = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("box")));
	     WebElement  regbutton = model.findElement(By.id("register-btn"));
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("arguments[0].scrollIntoView(true);", regbutton);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("vm--modal")));
	  regbutton.click();
  }
  @Test
  public void search() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='searchbar']")).sendKeys("Parry Hotter");
	  driver.findElement(By.id("button-search")).click();
	  
	  List<WebElement> items = driver.findElements(By.xpath("//ul[@data-v-159be0e2]/li"));
	  
	  boolean itemFound = false;
	  for(WebElement item : items) {
		  WebElement title = item.findElement(By.xpath("//div[@class='preview-title']"));
		  
		  if(title.getText().contains("Parry Hotter")) {
			  itemFound =true;
			  Thread.sleep(100000);
				driver.findElement(By.xpath("//li[@class='preview']//div[@class='preview-title' and text()='Parry Hotter']")).click();

			  break;
		  } 
	  }
	  //if item not found
	  
	  if(!itemFound) {
		  System.out.println("product not found");
		  		
	  } 
			  
  }
  @Test
  public void addToCart() {
	  driver.get("https://danube-webshop.herokuapp.com/books/2");
	  driver.findElement(By.xpath("//button[@class='call-to-action']")).click();
	  
	  
  }
  
}
