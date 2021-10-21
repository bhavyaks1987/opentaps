package com.start.org;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	
	//driver.findElement(By.name("alert")).click();
	
	
	Thread.sleep(2000);
	//simple alert
	//String text = driver.switchTo().alert().getText();
	
	//System.out.println(text);
	
	//driver.switchTo().alert().accept();
	
	// confirmation alert
	
	driver.findElement(By.name("confirmation")).click();
	
	Thread.sleep(5000);
	String text1 = driver.switchTo().alert().getText();
	System.out.println(text1);
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
	//promt alert
	
	Thread.sleep(5000);
	
	driver.findElement(By.name("prompt")).click();
	
	Thread.sleep(2000);
	//String text2 = driver.switchTo().alert().getText();
	//System.out.println(text2);
driver.switchTo().alert().sendKeys("fhg"); // will not be visible what we entered as it is in javascript ui...
	Thread.sleep(3000);
	//driver.switchTo().alert().accept();
	
	driver.switchTo().alert().dismiss();
	
	
	
	
	
	
	
	
	
	
}
}
