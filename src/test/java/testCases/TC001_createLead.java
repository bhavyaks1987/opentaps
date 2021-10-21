package testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import wrapper.projectspecificwrapper;

public class TC001_createLead extends projectspecificwrapper{  // if static is there in main methoad can not call non static menthods here

@Test
	
public void tc001() throws InterruptedException  {
	// this method will be called in parent file when @test executes it calls @before method internally in parent class loginOpentaps();
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
	
	// available under aftermethod which will be called closeopentap() once @test excecutes;
	}
	
	
	
	
	




}
	
	
	
	
	
	
	
	
	
	
	
	

	
	



