import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jdk.nashorn.internal.scripts.JS;
public class Practicepage2 {
	WebDriver driver =null;
	
	@BeforeTest
	public void setUpTest() {
		

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\temp\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		// driver.get("https://www.google.co.in/");
		// System.out.println(driver.getTitle());
	    //System.out.println(driver.getCurrentUrl());
	   
	    
	}
@Test
public  void Trychkbox() {	
	 
	driver.get("https://www.spicejet.com/default.aspx");
	 Select s = new Select (driver.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")));
	 s.selectByValue("USD");
	//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("Print");
	//driver.findElement(By.xpath("//*['@id=searchbox']/button")).click();
	//driver.quit();
	
	
	
	

  // driver.findElements(By.cssSelector("body > app-root > app-navbar > div > nav > ul > li:nth-child(2) > a"));
  
 
   // WebElement option2 = driver.findElement(By.cssSelector(" WebElement option1 = driver.findElement(By.cssSelector(\"#radio-btn-example > fieldset > label:nth-child(2) > input\"));"));
  //  option2.click();
   // driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS );
 // System.out.println(option2.isSelected());
  //  WebElement option3 = driver.findElement(By.cssSelector("#radio-btn-example > fieldset > label:nth-child(4) > input"));
  //  option3.click();
  //  driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS );
  // driver.quit();
   // driver.findElement(By.name("btnK")).click();
    //driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
    
}
@AfterTest
  public void tearDownTest() {
	
	//   driver.close();
	//   driver.quit();
	  // System.out.println("Test succesful");
	   
   }   
	   
	   
}
