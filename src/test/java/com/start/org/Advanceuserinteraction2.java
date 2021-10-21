package com.start.org;
import java.awt.RenderingHints.Key;
// cntl mouse clicking 
		import java.awt.Window;
		import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;
import org.openqa.selenium.By;
			import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

			import io.github.bonigarcia.wdm.WebDriverManager;


public class Advanceuserinteraction2 {
				
		public static void main(String[] args) throws InterruptedException {
					
					WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
					
			        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
			         
			        driver.manage().window().maximize();
			        
			        driver.get("https://jqueryui.com/selectable/"); 
			        
			        driver.switchTo().frame(0);
			        
			       WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
	
			        WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
		
			        WebElement item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
			        WebElement item7 = driver.findElementByXPath("//li[text()='Item 7']");
			        
			        Actions builder=new Actions(driver);
			        
			        builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform(); 
			        //keyDown=press keyUp=release    Anish(item7 is not getting pressing)
			        
			               
	}

}
