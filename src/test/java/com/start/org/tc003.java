package com.start.org;

import java.util.List;

import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class tc003 {
		
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
	
	         driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
	
driver.findElementByXPath("//input[contains(@name,'phoneNumber')]").sendKeys("5706046374"); //input[@name='phoneNumber']
	
driver.findElementByXPath("(//td[@class='x-btn-center'])[7]").click();

Thread.sleep(3000);

WebElement table = driver.findElement(By.className("x-grid3-row-table"));

                  List<WebElement> allrows = table.findElements(By.tagName("tr"));

                   WebElement firstrow = allrows.get(0);

                   List<WebElement> allcol = firstrow.findElements(By.tagName("td"));
                        
                   WebElement colcell=allcol.get(0);
                   System.out.println(colcell.getText());
                  driver.findElement(By.linkText(colcell.getText())).click(); //same number coming in gt txt so use this to get value
                   Thread.sleep(3000);
                   //colcell.click();
                   
                   //String text = allcol.get(0).getText();
                   
                   
                   
                                                               
                 //  System.out.println(text);
                   
                   //driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).click();


		 /*   
	       
	       WebElement ang = driver.findElementByXPath("//a[starts-with(text(),'10168')]");
	       //System.out.println(ang.getText());// need toc hcek
	       System.out.println(ang);
	
	         driver.findElementByXPath("(//a[contains(.,'Bhavya')])[4]").click();
	         driver.findElementByXPath("//a[normalize-space()='Delete']").click();*/
	
	
	
	
	
		}
	
	
	
	
}
