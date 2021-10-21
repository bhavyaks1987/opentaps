package com.start.org;
import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByLinkText;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
			
	        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
	         
	        driver.manage().window().maximize();
	        
	        driver.get("http:jqueryui.com/selectable"); 	
	        
	       // driver.switchTo().frame("demo-frame");//iframe by string--id,name
	      driver.switchTo().frame(0);// iframe by index number
	       // driver.switchTo().frame("//iframe[@class='demo-frame']");//by using x path(webelement)
	        driver.findElementByXPath("//li[text()='Item 1']").click();
	
	        driver.switchTo().defaultContent();   //comeout from frame
	        
	        driver.findElementByLinkText("Download").click();
	        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
}
