package com.start.org;


	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class tc002 {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
			
	        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
	         
	        driver.manage().window().maximize();
	        
	        driver.get("http://iarchtaps.com:8080/opentaps/control/main");  //calling required method
	  
		    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		 
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    
		    driver.findElement(By.className("decorativeSubmit")).click();
		    
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    
		    driver.findElement(By.linkText("Leads")).click();
		    
		    driver.findElementByLinkText("Find Leads").click();
		    
		    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("bhavya");
		     
		    //Thread.sleep(5000);
		   
		    
		    	driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();
		    	 Thread.sleep(5000);
		    	driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		    	System.out.println(driver.getTitle());
		    	
	String note = driver.getTitle();
	if(note.equals("View Lead | opentaps CRM"))
	{
System.out.println("Title verifies");
	}
	else
	{
		System.out.println("title not matching");
	}
	
	driver.findElementByLinkText("Edit").click();
	
	driver.findElementByClassName("inputBox").clear();
	  WebElement comp = driver.findElement(By.className("inputBox"));
	comp.sendKeys("Infosys");  //verifiing the change is pending 
	
	driver.findElementByClassName("smallSubmit").click();
	
	if(driver.findElementById("viewLead_companyName_sp").getText().contains("Infosys")) {
		System.out.println("updated company name successfully");
	}
		else {
			System.out.println("failed uodation");
		}
	
	driver.close();
	

	
		} }
	

