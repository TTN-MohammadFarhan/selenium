package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//upcasting
		WebDriver driver = new ChromeDriver();
		WebDriverWait driverWait=new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
//		WebElement address=driver.findElement(By.xpath("//select[@name=\"country\"]"));
//		Select  s=new Select(address);
//		s.selectByValue("SRI LANKA");
		WebElement address=driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
		address.click();
		Alert alert=driver.switchTo().alert();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alert.accept();
	}

}
