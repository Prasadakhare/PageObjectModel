package groupsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String strbrowser) {
		if(strbrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(strbrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		
	}
	
  @Test
  public void loginpage() {
	  driver.get("https://www.google.com/");
	  
  }
}
