package groupsScripts;

import org.testng.annotations.Test;

public class SampleOneTest {
	
  @Test(groups="feature1" )
  public void testOne() {
	  long id = Thread.currentThread().getId();
	  System.out.println("Test 11 in Sample One..."+id);
  }
  
  @Test(groups="feature2")
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
