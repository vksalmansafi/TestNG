package utilities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametizationwithExcel {
	
	 public static ExcelReader excel = null;
	
	@Test (dataProvider="getdata")
	public void dologin(String username,String password)
	{
		
		System.out.println(username+"---"+password);
		
	
		
	}
	
	
	@DataProvider
	public Object[][] getdata(){
		
		
		if (excel == null) {
			
			
			excel = new ExcelReader("C:\\Users\\Salman\\Desktop\\testngexcel.xlsx");
			
		}
		
		String sheetName = "loginsheet";
		int rows= excel.getRowCount(sheetName);
		int cols =excel.getColumnCount(sheetName);
		
		Object [][] data = new Object [rows-1][cols];				
		 
		for (int rowNum=2; rowNum<=rows;rowNum++) {
										
			for (int colNum=0;colNum<cols;colNum++) {	
										
				    data[rowNum-2][colNum]=excel.getCellData(sheetName,colNum,rowNum);	
		 
		 
			}
		}
	
		
		return data ;
	}
	
	

}
