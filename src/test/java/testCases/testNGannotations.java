
	package testCases;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;


	import wrapper.projectspecificwrapper;

	public class testNGannotations extends projectspecificwrapper{  // if static is there in main methoad can not call non static menthods here

	@Test (invocationCount=2)// tc001 will execute 2 times
		
	public void tc001() throws InterruptedException  {
		loginOpentaps();
		click(locSelector("link","Create Lead"));
		clearAndType(locSelector("id","createLeadForm_companyName"),"Atkins");
		clearAndType(locSelector("id","createLeadForm_firstName"),"Bhavya");
		clearAndType(locSelector("id","createLeadForm_lastName"),"Sudhama");
		selectDropDownUsingText(locSelector("id","createLeadForm_dataSourceId"),"Conference" );
		selectDropDownUsingValue(locSelector("id","createLeadForm_industryEnumId"),"IND_SOFTWARE" );
		selectDropDownUsingIndex(locSelector("id","createLeadForm_ownershipEnumId"),3 );
		selectDropDownUsingValue(locSelector("id","createLeadForm_currencyUomId"),"USD" );
	    click(locSelector("class", "smallSubmit")); 
	    getTText(locSelector("xpath", "//span[@id='viewLead_companyName_sp']")); // ask anish to get only emp number
		
		closeopentap();
		}
		
	
}
