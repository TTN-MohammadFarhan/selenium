package demo;

import java.util.List;
import java.util.Set;
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

public class windowhandles {
	private static WebDriver driver;
	 
	
	@BeforeMethod
		public void launch()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait driverWait=new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/guru99home/");
			
		}
	@Test
	public void ifram() throws InterruptedException {
		
//		driver.findElement(By.xpath("//iframe[@data-google-container-id=\"1\"]")).click();
//		WebElement elementName=driver.findElement( By.xpath("//iframe[@data-google-container-id=\"1\"]"));
//		String tagName=elementName.getText();
//		System.out.println(elementName.);
//		driver.switchTo().frame(elementName);
//		driver.switchTo().defaultContent();
		//code of guru99
	    //int size = driver.findElements(By.tagName("iframe")).size();
		
	/*for(int i=0; i<=size; i++){
	    driver.switchTo().frame(i);
	    int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent(); //switching back from the iframe
	 }*/
	            
		//Commented the code for finding the index of the element
	    driver.switchTo().frame(0); //Switching to the frame
	    
	    System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
		
		Thread.sleep(1000);
		
//	  List<WebElement> st=driver.findElements(By.tagName("iframe"));
//	  System.out.println(st.get(0).getText());
	  //driver.switchTo().frame(st.get(0).getTagName())
	}

//	@Test
//	public void tab() throws InterruptedException
//	{
//		driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
//		String whandles=driver.getWindowHandle();
//	     System.out.print(whandles);
//	     Set<String> allhandles=driver.getWindowHandles();
//	     System.out.print(allhandles);
//	     
//	    String Hreading = driver.switchTo()
//	    		                       .window(allhandles.stream().toList().get(1))
//	    		                             .findElement(By.id("sampleHeading"))
//	    		                                  .getText();
//	     Assert.assertEquals(Hreading, "This is a sample page");
//	    
//	     //driver.switchTo().
//	}
	
//	@Test
//	public void window()
//	{
//		driver.findElement(By.xpath("//button[@class=\"mt-4 btn btn-primary\"]")).click();
//	     String whandles=driver.getWindowHandle();
//	     System.out.print(whandles);
//	     Set<String> allhandles=driver.getWindowHandles();
//	     System.out.print(allhandles);
//	     
//	   driver.switchTo().window(allhandles.stream().toList().get(1));
//	   String a= driver.findElement(By.id("sampleHeading")).getText();
//	   Assert.assertEquals(a, "This is a sample page");
//	     
//	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
}

