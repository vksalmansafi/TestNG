package learningTestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Firsttest {
	
	
	@Test
	public void Testcase1()
	{
		
		//String actual="google";
		
		//String expected ="google";
		
		SoftAssert softassert = new SoftAssert();
		
		
		System.out.println("Printing the result");
		softassert.assertEquals(false,true);
		
		
        System.out.println("Printing the test case 1.a result");
		
		Assert.assertEquals(true, true);
		
		softassert.assertAll();
		
		}
	 
	@Test
	  public void Testcase2()
	  {
		  
		  
		System.out.println("Printing the test case 2 result");
		
		Assert.assertEquals(true, true);
		  
	  }

	
	
	
}
