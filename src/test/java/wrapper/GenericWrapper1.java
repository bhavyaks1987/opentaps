package wrapper;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper1 implements anishWrapperIf{
	
	public RemoteWebDriver driver;

	@Override
	public void invokeBrowser(String browser, String url) {
		 
			if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver=new ChromeDriver();
			}
			else if(browser.equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
				}
			else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				
			}
			
			 driver.get(url); 
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   System.out.println("Browser "+browser+" launched successfully");
		}
			  
		
	

	@Override
	public WebElement locSelector(String selType, String selValue) {
		if(selType.equals("id")) {
			return driver.findElement(By.id(selValue));
		       }
		else if(selType.equals("class")) {
			return driver.findElement(By.className(selValue));
			   }
		else if(selType.equals("link")) {
			return driver.findElement(By.linkText(selValue));
		       }
		else if(selType.equals("xpath")) {
			return driver.findElement(By.xpath(selValue));
		        }
		
		return null;
	}
	
	public void tablehandle(WebElement ele,int row,int col ) throws InterruptedException {
		Thread.sleep(3000);
		WebElement table =ele;

        List<WebElement> allrows = table.findElements(By.tagName("tr"));

         WebElement firstrow = allrows.get(row);

         List<WebElement> allcol = firstrow.findElements(By.tagName("td"));
              
         WebElement colcell=allcol.get(col);
         System.out.println(colcell.getText());
         
   driver.findElementByLinkText(colcell.getText()).click();
		
		
	}

	@Override
	public List<WebElement> locSelectors(String selType, String selValue) {
		
		
		
		
		return null;
	}

	@Override
	public void click(WebElement ele) throws InterruptedException {
		ele.click();
	
		
	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear(WebElement ele) {
		ele.clear();
		
	}

	

	@Override
	public void clearAndType(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		
	}

	@Override
	public String getElementText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getTText(WebElement ele) {
		ele.getText();
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
		
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dd=new Select(ele);
		dd.selectByIndex(index);
	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select dd=new Select(ele);
		dd.selectByValue(value);
		
	}

	 

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		
		
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterAlertText(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchOutFrame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		if(driver.getTitle().equals(title)) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("title not matched");
		}
		
		
		return false;
	}

	@Override
	public void close() {
		driver.close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}


	
	




}
