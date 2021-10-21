package testCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import wrapper.GenericWrapper1;
import wrapper.projspecificwrapperparams;

public class readExcel  {
	public  String[][] excel() throws IOException {
		
		
		XSSFWorkbook wb=new XSSFWorkbook("./Data/tc001.xlsx"); //workbook
		XSSFSheet sh = wb.getSheet("Sheet1");                  // enter into sheet
		
		// get row count
		int rowCount = sh.getLastRowNum();
		System.out.println(rowCount);    // apache poi consider 1st row as header so it will include ist row in the count
			  
			// get column count
		int colCount = sh.getRow(0).getLastCellNum();
		System.out.println(colCount);	
		
		String[][] data=new String[rowCount][colCount];
			
		for (int i = 1; i <= rowCount; i++) {                                               // to get for loop automatically select the part to be iterated right click select for iteration
			XSSFRow row = sh.getRow(i);
			for(int j=0;j<colCount;j++)	 {                              //enter inro row
			XSSFCell cell = row.getCell(j);                     //enter into cell
			String val = cell.getStringCellValue(); // get the data from cell
			
			data[i-1][j]=val;      // refer dataprovider basic code....data shoud fetcf from 0.0 as ist row is not considered under count here
			
			System.out.println(val); // print the value
		}
		}
		
		return data;  // under not main method necessary to read data to get value
	}
	
	
	
	

}
