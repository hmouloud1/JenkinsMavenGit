package framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TestNg {

	 WebDriver driver;
	
  @Test
  public void test1() {
	  
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //Launch the Online Store Website
      driver.get("http://www.onlinestore.toolsqa.wpengine.com");
	// Find the element that's ID attribute is 'account'(My Account)
      driver.findElement(By.id("account")).click();
      driver.findElement(By.id("log")).sendKeys("testuser_1");
      driver.findElement(By.id("pwd")).sendKeys("Test@123");
      driver.findElement(By.id("login")).click();
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
      driver.findElement(By.id("account_logout"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\bazbo\\Desktop\\libs\\geckodriver.exe");
	  
	  driver = new FirefoxDriver();

	  System.out.println("hello world");
		
     // driver = new FirefoxDriver();
 
      //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      //Launch the Online Store Website
 
      driver.get("http://www.onlinestore.toolsqa.wpengine.com");
  }

  @AfterMethod
  public void afterMethod() {

      driver.quit();
  }

}
