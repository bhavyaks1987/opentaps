package wrapper;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class projectspecificwrapper extends GenericWrapper1{
	
	@Parameters()// to use static data during run time(xml file) 1>declre parameter value in xml file give uname and pswd,3.declare it in string username,password,4,replace hardcoded value with sername and password
	@BeforeMethod
	public void loginOpentaps() throws InterruptedException  {
		invokeBrowser("chrome","http://iarchtaps.com:8080/opentaps/control/main");
		clearAndType(locSelector("id","username"),"DemoSalesManager" );
		clearAndType(locSelector("id","password"),"crmsfa" );
		click(locSelector("class", "decorativeSubmit"));
		click(locSelector("link","CRM/SFA"));
		}
	@AfterMethod
	public void closeopentap() {
	close();
		

	}
	
	@BeforeSuite
	public void beforsuite() {
	System.out.println("before suite");
	}
	
	
	@BeforeTest
	public void beforetest() {
	System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeclass() {
	System.out.println("before class");
	}
	@AfterMethod
	public void aftermethod() {
	System.out.println("aftermethod");
	}
	
	
	@AfterClass
	public void afterclass() {
	System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest() {
	System.out.println("after test");
	}
	
	@AfterSuite
	public void aftersuite1() {
		System.out.println("aftersuite");
		}
	// connecting to remote system,and connect to data base to get data before test is one time use all these can be includee under before suite

}
