package parallelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleThreeTest {
	
	
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
	
	
	@Test(groups="feature5")
	  public void testOne() {
		long id = Thread.currentThread().getId();
		  System.out.println("Test 31 in Sample One......");
	  }
	  
	  @Test(groups="feature6")
	  public void testTwo() {
			long id = Thread.currentThread().getId();
		  System.out.println("Test 31 in Sample Two.....");
	  }
	  @Test(groups="feature7")
	  public void testThree() {
			long id = Thread.currentThread().getId();
		  System.out.println("Test 31 in Sample Three.....");
	  }
	  
	  @Test(groups="feature8")
	  public void testFour() {
		
			long id = Thread.currentThread().getId();
		  System.out.println("Test 31 in Sample Four......");
	  }
	}
}

