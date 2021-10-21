package com.start.org;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Tc004 {
		
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
		    
	        driver.findElementByXPath(" //a[text()='Merge Leads']").click();
	        
	        driver.findElementByXPath("//img[@alt='Lookup']").click();
	        
	        //switching to new window
	        
	        Set<String> allwin=driver.getWindowHandles(); // returns all opened window ref value inside allwin
	        
	        List<String> lst=new ArrayList<String>(allwin);  //convert set to list to get one ref value of a win
	        
	        driver.switchTo().window(lst.get(1));
	        
	        System.out.println(driver.getTitle());
	        
	        driver.findElementByXPath("//input[@type='text']").sendKeys("10248");
	        
	        driver.findElementByClassName("x-btn-right").click();
	        
	      
	        Thread.sleep(2000);
	        
	        driver.findElementByLinkText("10248").click();
	        
	        driver.switchTo().window(lst.get(0));
	        
	        driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
	      //switch window
	        
	        allwin=driver.getWindowHandles();
	         
	       lst=new ArrayList<String>(allwin);
	        
	        driver.switchTo().window(lst.get(1));
	        
	        Thread.sleep(2000);
	        
 driver.findElementByXPath("//input[@type='text']").sendKeys("10032");
	        
	        driver.findElementByClassName("x-btn-right").click();
	        
	       //driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
	       
	    // driver.findElementByXPath("//a[@class='linktext' and @id='ext-gen297']").click(); // anish
	     
	      driver.findElementByXPath("//div//a[@class='linktext']").click();
	     driver.switchTo().window(lst.get(0));
	     
	     driver.findElementByLinkText("Merge").click();
}}
