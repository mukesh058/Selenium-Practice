package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAssetions {
  @Test
  public void hardAssertion() {
	  System.out.println("Testng Reports ");
	  
	  System.out.println("Execution 1");
	  
	  Assert.assertEquals(1, 1); 					// Hard Assertion , Execution will be stopped further
	  
	  System.out.println("Execution complete1");
	  
	  
  }
  @Test
  void softAssertion() {
	  System.out.println("Execution 2");
	  
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(1,1);
	  
	  System.out.println("Execution complete2");
	  sa.assertAll();   						// its mandaytory to call assertAll method when we use SoftAssertion 
  }
}
