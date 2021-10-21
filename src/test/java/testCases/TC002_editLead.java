package testCases;



import org.testng.annotations.Test;


import wrapper.projectspecificwrapper;

public class TC002_editLead extends projectspecificwrapper{ 
	
	@Test
	
	public void tc002() throws InterruptedException   {
		
		click(locSelector("link","Leads"));
		click(locSelector("link", "Find Leads"));
		clearAndType(locSelector("xpath","(//input[@name='firstName'])[3]"),"bhavya");
		click(locSelector("xpath","(//td[@class='x-btn-center'])[7]"));
		Thread.sleep(3000);
		click(locSelector("xpath","(//a[@class='linktext'])[6]"));
	
		tablehandle(locSelector("class","x-grid3-row-table" ), 0, 0);
		//System.out.println("print ok");
		//verifyTitle("View Lead | opentaps CRM");
		
		
		
		
		
		
	}

}
