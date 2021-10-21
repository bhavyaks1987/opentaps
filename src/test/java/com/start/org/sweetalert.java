package com.start.org;



	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class sweetalert {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://sweetalert.js.org/guides/");
		driver.manage().window().maximize();
		driver.findElement(By.className("preview")).click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[@class='swal-button swal-button--confirm']").click();
		
		// close icon and chcek box in alert can not be automated.
		
	}}
	
	
	
	

