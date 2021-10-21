package wrapper;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Genericwrapper {
	
	public RemoteWebDriver driver;
	
	
	
	public void Invokebrowser(String Browser,String url) {
		if(Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(Browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			}
		else if(Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			
		}
		
		 driver.get(url); 
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   System.out.println("Browser "+Browser+" launched successfully");
	}
		  
	
	public WebElement Locselector(String seltype,String selvalue) {
		if (seltype.equals("id")) {
			return driver.findElement(By.id(selvalue));
		}
		else if(seltype.equals("linktext")) {
			return driver.findElement(By.linkText(selvalue));
		}
		return null;
		
	}
	
	  public void type(WebElement eel,String val) {    // WebElement eel = driver.findElement(By.id(locvalue));given in runtime
		   eel.sendKeys(val);
		   System.out.println("the data" +val+ "entered successfully");
		   }
		
	   public void click(WebElement eel) {
		   eel.click();
		   
		  
	
	
	
	
		
					  
					   
					
		   }
		  
		 
		   
	}


	
//	public static void main(String[] args) {
		//Genericwrapper a=new Genericwrapper(); 
	//	a.Invokebrowser("chrome","https://www.google.com");
	//}
	
	

	
  
	
	
	
	
	
	
	
	
	
	
	
	
	


