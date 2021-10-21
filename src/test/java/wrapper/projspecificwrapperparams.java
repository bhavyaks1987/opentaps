package wrapper;

 

	import java.io.IOException;

import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testCases.readExcel;

	public class projspecificwrapperparams extends GenericWrapper1{
		
		@Parameters({"browser","uname","pswd"})// to use static data during run time(xml file) 1>declre parameter value in xml file give uname and pswd,3.declare it in string username,password,4,replace hardcoded value with sername and password
		@BeforeMethod
		public void loginOpentaps(String browser,String username,String password) throws InterruptedException  {
			invokeBrowser(browser,"http://iarchtaps.com:8080/opentaps/control/main");
			clearAndType(locSelector("id","username"), username);
			clearAndType(locSelector("id","password"), password);
			click(locSelector("class", "decorativeSubmit"));
			click(locSelector("link","CRM/SFA"));
			}
		@AfterMethod
		public void closeopentap() {
		close();
		}	
	
		
// this is basic for data provider with hard coding	
 @DataProvider(name="fetchData1")
	public String[][] getdata1() {
		
		String[][] data=new String[2][3];
		
		data[0][0]="atkins";
		data[0][1]="bhavya";
		data[0][2]="sudhama";
		
		
		data[1][0]="google";
		data[1][1]="anish";
		data[1][2]="shah";
		
		return data;  } 
		
 
 // this is not for hardcoding..this function reading data from excel and provide this data as input to test class
		@DataProvider(name="fetchData") 
		
		public String[][] getdata() throws IOException{
			readExcel r=new readExcel(); // calling exl class
			
		String[][] drc = r.excel();           // callingexcel method and assigning into string 2d
		
		return drc;                    // return the value 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
