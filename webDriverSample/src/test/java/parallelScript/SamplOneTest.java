package parallelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SamplOneTest {
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

public class SampleOneTest {
  @Test(invocationCount=4, threadPoolSize=2, timeOut=1000)
  public void testOne() {
	 
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 11 in Sample One..."+id);
  }
  
  @Test
  public void testTwo() {
	
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 12 in Sample Two..."+id);
  }
  @Test
  public void testThree() {
	  
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 13 in Sample Three..."+id);
  }
  
  @Test
  public void testFour() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 14 in Sample Four..."+id);
  }
}
	}
}
