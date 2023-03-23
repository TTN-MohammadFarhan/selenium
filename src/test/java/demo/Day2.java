package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	private static WebDriver driver;
	 
	
	@BeforeMethod

		public void launch()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait driverWait=new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
			
		}
	
	//@Parameters("browser")
//	@Test(priority=2)
//	public void demo() throws InterruptedException {
//		String e="DEMOQA";
//	  String sTitle=driver.getTitle();
//	  System.out.println(sTitle);
//	  Assert.assertEquals(sTitle,e,"Title doesnt match");
//	 
//	  WebElement el= driver.findElement(By.xpath("//label[text()='Male']"));
//	  Actions ac=new Actions(driver);
//	  ac.moveToElement(el).click().perform();
//	  Thread.sleep(2000);
////	  --------------------------	
//	} 
	@Test(priority=1)
	public void demo1() {
		
		WebElement element=driver.findElement(By.xpath("//h5"));
		element.isDisplayed();
		String title=element.getText();
		Assert.assertEquals(title, "Student Registration Form");
		System.out.println(element.getText());
//		WebElement eFirstName=driver.findElement(By.id("firstName"));
//		String fName=eFirstName.getTagName();
//		WebElement eLastName=driver.findElement(By.id("lastName"));
//		String lName=eLastName.getTagName();
//		WebElement Email=driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]"));
//		String sEmail=Email.getTagName();
//		eFirstName.
//		Assert.assertEquals(fName,"Mohammad","first name is not matched");
//		Assert.assertEquals(lName, "farhan","last name is not matched");
//		Assert.assertEquals(sEmail,"mohammad.farhan@tothenew.com","email is not matched");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}
