package com.start.org;


	
	

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

public class windowHandling {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup(); //to get the driver instead of using system.set properties
			
	        ChromeDriver driver=new ChromeDriver(); // creating obj to call the class and methods
	         
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.w3schools.com/js/js_popup.asp");
	        
	        driver.findElementByLinkText(("Try it Yourself »")).click();
	        
	       /*we have to switch control from one window to another-uunique ref value required..
	        * amnually can not be done.so by using
	        * syntax String Currentactwin=driver.windowhandle(); windowhandle--returns current active window reference and it returns the datatype as string(output)
	         windowhandles- returns current active window and also all widow reference  which is opened by the present session and returns the collections of string
	         i e set of string..so collection of strings which will not be duplicated will be used here
	         can be achieved*/
	       System.out.println(driver.getTitle());
	       Set<String> allwin=driver.getWindowHandles();//get all window ref value and string value using set
	        
	      //  System.out.println(allwin);//displaces the ref value and string valueof all windows which are opened
	        
	        List<String> lst=new ArrayList<String>(allwin);// covert set to list to get one window ref value
	        // widow switch from 1st to second
	        driver.switchTo().window( lst.get(1));   //get one ref value and passit then switch window
	        
	        System.out.println(driver.getTitle());//to check did window switched or not
	        
	        driver.findElementById("tryhome").click();
	        
	        //window switch from 2nd to third
	        
	         allwin=driver.getWindowHandles(); // data type already decalred for allwin(while switching to frt windw) ,,no need to repeat again
	        
	         lst=new ArrayList<String>(allwin);  //  data type already decalred for list ,,no need to repeat again
	        
	        
	        driver.switchTo().window(lst.get(2));
	        
	        Thread.sleep(2000);
	        
	        System.out.println(driver.getTitle());
	        
	        // switch from 3rd to 1st win
	        
	        driver.switchTo().window(lst.get(0));
	        
	
}

		private static void getwindowHandles() {
			// TODO Auto-generated method stub
			
		}}