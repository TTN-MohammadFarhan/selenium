package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
	private  WebDriver driver;

	@BeforeMethod
	public void launch()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	WebDriverWait driverWait=new WebDriverWait(driver,20);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
		
	}
	
 @Test(priority = 1)
 public void homeTest() throws InterruptedException
 {
	 driver.findElement(By.id("nav-logo-sprites")).click();
	 Thread.sleep(100);
 }
 
 @Test(priority = 2)
 public void Search() {
	 WebElement wbEle= driver.findElement(By.xpath("//input[@name=\"field-keywords\"]"));
	 wbEle.sendKeys("chocolates");
	 wbEle.submit();
 }
 
 @Test(priority = 3)
 public void cart() {
	 driver.findElement(By.id("nav-cart-count")).click();
 }
 
@AfterMethod
 public void closebrowser()
	{
		driver.close();
	}
}
