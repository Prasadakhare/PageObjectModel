package groupsScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleTwoTest {
	
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
	@Test(groups="feature3")
	  public void testOne() {
	
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 21 in Sample One");
	  }
	  
	  @Test(groups="feature4")
	  public void testTwo() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 22 in Sample Two");
		
	  }
	  @Test
	  public void testThree() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 23 in Sample Three");
	  }
	  
	  @Test
	  public void testFour() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test 24 in Sample Four");
	  }
	
}}

