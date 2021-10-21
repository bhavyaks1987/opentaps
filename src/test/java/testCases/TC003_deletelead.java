package testCases;

import org.testng.annotations.Test;


import wrapper.projectspecificwrapper;

public class TC003_deletelead extends projectspecificwrapper{
	
	@Test
	public void tc003() throws InterruptedException {
		loginOpentaps();
		click(locSelector("link","Leads"));
		click(locSelector("link", "Find Leads"));
		clearAndType(locSelector("xpath","(//input[@name='firstName'])[3]"),"bhavya");
		click(locSelector("xpath","(//td[@class='x-btn-center'])[7]"));
		Thread.sleep(3000);
		click(locSelector("xpath","(//a[@class='linktext'])[6]"));
		
		closeopentap();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
