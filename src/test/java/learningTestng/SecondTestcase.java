package learningTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestcase {
	
	
	@Test(priority=1)
	  public void register()
	  
	  {
		  
		
		 System.out.println("User trying to register in portal");
		  
		  Assert.assertTrue(false," logged in fail");
		  
		  
	  }
	
	@Test(priority=2,dependsOnMethods="register")
	  public void dologin()
	  
	  {
		  
		  
		  System.out.println("validating the user");
		  
		  Assert.assertEquals(true, true);      
		  
	  }
	  
	  @Test(priority=3,dependsOnMethods= {"register","dologin"}, alwaysRun=true)
	  public void thirdcase()
	  
	  {                                                                    // softdependy, use alwayRun=true to run even if dependcy method fail fail
	  
		  System.out.println("printing the test case ");
		  
	  }	  

}
