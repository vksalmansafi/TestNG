package learningTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parametization {
	
     

	
	@Test(dataProvider = "getdata")
	public void login(String username, String password) {
		
		
		System.out.println(username+"---"+password);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getdata() {
		
		
		    Object[][] data = new Object[3][2];
		    
		    data[0][0] ="salman@hahoo.com";
		    data[0][1] = "dsjfldsjf";
		    data[1][0]  = "dkfjadsklfn@klj.com";
            data [1][1] = "lkflksdjf";
            data [2][0] = "vksalman@gmail.com";
            data [2] [1]  = "kljlkfj";
		    		
		    
			return data;
		    
		
		
	}

}
