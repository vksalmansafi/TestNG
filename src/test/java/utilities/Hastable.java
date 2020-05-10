package utilities;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hastable {
	
	
	public static ExcelReader excel = null;
	
	@Test(dataProvider ="dataprovider")
	public void getdata(Hashtable <String,String> data) {
		
		
		System.out.println(data.get("username")+"--"+data.get("password"));
		
	
	}
	
	
	
	@DataProvider
	public static Object dataprovider() {
		
		
		if(excel==null) {
			
			
			excel= new ExcelReader("C:\\Users\\Salman\\Desktop\\testngexcel.xlsx");
		}
			
		
		String sheetName = "loginsheet";
		
		int rows=excel.getRowCount(sheetName);
		int cols=excel.getColumnCount(sheetName);
		
		Object [][] data = new Object [rows-1][1];
		
		Hashtable<String,String> table= null;
		
		for (int rowNum=2;rowNum<=rows;rowNum++) {
			
		 for (int colNum=0;colNum<=cols;colNum++) {
			 
			 
			 table.put(excel.getCellData(sheetName,colNum, 1),excel.getCellData(sheetName, colNum, rowNum));
			 
			 data [rows-2][0]=table;
			 
			 
		 }
			
			
		}
		
		return data;
	}
	
	

}
