package com.start.org;

import java.util.List;

import javax.security.auth.kerberos.KeyTab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
		
        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
         
        driver.manage().window().maximize();
        
        driver.get("https://erail.in/");
        
        driver.findElementById("txtStationFrom").clear();
		
        driver.findElementById("txtStationFrom").sendKeys("SBC",Keys.TAB); // when we ahve to use tab to select the elemnt
        
        driver.findElementById("txtStationTo").clear();
        
        driver.findElementById("txtStationTo").sendKeys("MAS",Keys.TAB);
		
		// webtable
        Thread.sleep(2000);// no such element exception
       WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']")); // when xpath is used class can contain white space,when find by class used class shoumd not contain white space
	
		                             // to locate the one cell in table ....there are many cells(clm values)..we ahve to collect them using web 
                                     //elements and with common attribute here it is tr 
		//for rows
		List<WebElement> allRows = table.findElements(By.tagName("tr"));  // there are so name tr collection so it comes under collection and dupliacte ie list
		
		                             //if more than one table on teh page all tr will get selected so taht why change driver into selectedtable name=table1
	
	WebElement secRow = allRows.get(1);
	
	   // for colms
	
	List<WebElement> allcolmn = secRow.findElements(By.tagName("td"));
	
	String text = allcolmn.get(1).getText(); 
	
	System.out.println(text);
	
	
	// find table,,give name to table,find all rows using find elelcemt put those rows in 
	//list collection(allrows)...fetch required row using get...give name to taht row,,
	//get all colnms in taht row using find elelments and store in collection(allcolmn) 
	//...get required col from taht collection using get

	}
	
	

}    // anish 
