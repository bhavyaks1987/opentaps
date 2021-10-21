package com.start.org;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserSetup {
	WebDriver dvr;
	
	@Test
	public void invokeBrowser(String browsername,String url)  {
		if(browsername.equals("ch")) {
		  
WebDriverManager.chromedriver().setup();
  dvr=new ChromeDriver();  
 
 }
		
		else if(browsername.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
		 dvr=new FirefoxDriver();
			
		}
 if(browsername.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		dvr=new EdgeDriver();
		
		}
			dvr.findElement(By.id(url));
			
	dvr.get(url);		
	//dvr.f	

//WebDriver dvr.get("http://iarchtaps.com:8080/opentaps/control/main");
}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


