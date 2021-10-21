package com.start.org;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
		
        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
         
        driver.manage().window().maximize();
        
        driver.get("http://iarchtaps.com:8080/opentaps/control/main");  //calling required method
  
	    driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    
	    driver.findElement(By.linkText("Create Lead")).click();                                                 //id had dymanic value since it is under anchor tag selecet linktext
              
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Atkins");
	
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhavya");
	    
	    WebElement src= driver.findElement(By.id("createLeadForm_dataSourceId"));//storing the value in src and declaring datatyep for src
	
	    Select dd=new Select(src);   //create obj to call class name         //import select class for drop down craete onject put value src
	    
	    //dd.selectByVisibleText("Conference");
	     // dd.selectByVisibleText("Employee");
	    //dd.selectByValue("LEAD_EMPLOYEE");
	    dd.selectByIndex(3);
	    
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhoomi");
	    
	    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
	    
	    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");
	    
	    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000");
	    
	    WebElement src1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    
	    Select ind=new Select(src1);
	    
	   ind.selectByValue("IND_SOFTWARE");
	   //ind.selectByVisibleText("Computer Software");
	   
	   WebElement src2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   
	   Select own=new Select(src2);
	   
	   //own.selectByValue("OWN_PARTNERSHIP");
	    //own.selectByVisibleText("Partnership");
	    own.selectByIndex(3);
	    
	    WebElement src3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
	    
	    Select cur=new Select(src3);
	         
	    //cur.deselectByValue("USD");
	    cur.selectByVisibleText("USD - American Dollar");
	    
	    
	    
	}
	
	
	
	
}
