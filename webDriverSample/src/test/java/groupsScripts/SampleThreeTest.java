package groupsScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	@Test(groups="feature5")
	  public void testOne() {
		  System.out.println("Test 31 in Sample One");
	  }
	  
	  @Test(groups="feature6")
	  public void testTwo() {
		  System.out.println("Test 31 in Sample Two");
	  }
	  @Test(groups="feature7")
	  public void testThree() {
		  System.out.println("Test 31 in Sample Three");
	  }
	  
	  @Test(groups="feature8")
	  public void testFour() {
		  System.out.println("Test 31 in Sample Four");
	  }
	}


