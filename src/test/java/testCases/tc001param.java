package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import wrapper.projectspecificwrapper;
import wrapper.projspecificwrapperparams;

public class tc001param extends projspecificwrapperparams{  // if static is there in main methoad can not call non static menthods here

	// data provider basic
@Test(dataProvider="fetchData")
	
public void tc001(String cname,String fname,String lname) throws InterruptedException  {
	// this method will be called in parent file when @test executes it calls @before method internally in parent class loginOpentaps();
	click(locSelector("link","Create Lead"));
	clearAndType(locSelector("id","createLeadForm_companyName"),cname);
	clearAndType(locSelector("id","createLeadForm_firstName"),fname);
	clearAndType(locSelector("id","createLeadForm_lastName"),lname);
	selectDropDownUsingText(locSelector("id","createLeadForm_dataSourceId"),"Conference" );
	selectDropDownUsingValue(locSelector("id","createLeadForm_industryEnumId"),"IND_SOFTWARE" );
	selectDropDownUsingIndex(locSelector("id","createLeadForm_ownershipEnumId"),3 );
	selectDropDownUsingValue(locSelector("id","createLeadForm_currencyUomId"),"USD" );
    click(locSelector("class", "smallSubmit")); 
    getTText(locSelector("xpath", "//span[@id='viewLead_companyName_sp']")); // ask anish to get only emp number
	

}}
