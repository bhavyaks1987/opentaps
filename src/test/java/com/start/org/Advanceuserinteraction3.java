package com.start.org;
import java.awt.RenderingHints.Key;
//  mouse hover function
		import java.awt.Window;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.matcher.ModifierMatcher.Mode;

public class Advanceuserinteraction3 {
				
		public static void main(String[] args) throws InterruptedException {
					
					WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
					
			        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
			         
			        driver.manage().window().maximize();
			        
			        driver.get("https://www.flipkart.com/"); 
			        
			        driver.findElementByXPath("//button[text()='✕']").click();
			        
			        WebElement elec = driver.findElementByXPath("//div[text()='Electronics']");
			
			        
			        Actions builder=new Actions(driver);
			        
			        builder.moveToElement(elec).perform();
			        // when dropdown disappears as soon as mouse moves
			        // click on source,click on page with drop down -f8 it will be pause in debugger Mode.so element can be located easily now.
			        // we can use same method for selecting multiple options in dropdown/usually select menthos will be used.
			        driver.findElementByXPath("//a[text()='Gaming']").click();
			        
			        
			        
			        
			        
			        
			        
			        
}}
