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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

			import io.github.bonigarcia.wdm.WebDriverManager;

// drag and drop action 
public class Advanceuserinteraction {
				
		public static void main(String[] args) throws InterruptedException {
					
					WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
					
			        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
			         
			        driver.manage().window().maximize();
			        
			        driver.get("https://jqueryui.com/droppable/"); 
			        
			        driver.switchTo().frame(0);
			        
			        // all mouse and keyboard actions stored under action class..so to use this call the class by craeting objects
			        
			        WebElement drag = driver.findElementById("draggable");
			        
			        WebElement drop = driver.findElementById("droppable");
			        
		            Actions builder=new Actions(driver);   // all keybaod and mouse actions performed on driver
		
		           // builder.dragAndDrop(source, target)                                   // right click on mouse-context click
		
		             builder.dragAndDrop(drag, drop).perform(); // perform is mandatory at teh end of action class
		
		
		
		
		
		
		
		
		
		
		

	}

}
