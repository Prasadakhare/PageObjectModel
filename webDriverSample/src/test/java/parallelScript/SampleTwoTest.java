package parallelScript;

import org.testng.annotations.Test;

public class SampleTwoTest {
	@Test(groups="feature3")
	  public void testOne() {
		  System.out.println("Test 21 in Sample One");
	  }
	  
	  @Test(groups="feature4")
	  public void testTwo() {
		  System.out.println("Test 22 in Sample Two");
	  }
	  @Test
	  public void testThree() {
		  System.out.println("Test 23 in Sample Three");
	  }
	  
	  @Test
	  public void testFour() {
		  System.out.println("Test 24 in Sample Four");
	  }
	
}

