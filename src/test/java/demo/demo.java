package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Dialect;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//upcasting
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait driverWait=new WebDriverWait(driver,20);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		//driver.findElement(By.id("firstName")).sendKeys("farhan");
//		driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("mohammad");
//		//driver.findElement(ByCssSelector.xpath("input#firstName[type=\"text\"]")).sendKeys("farhan");
//		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("farhan");
//		driver.findElement(By.xpath("//input[@placeholder=\"name@example.com\"]")).sendKeys("mohammad.farhan@tothenew.com");
//		driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("8194071586");
//		driver.findElement(By.id("////textarea[@id=\"currentAddress\"]")).sendKeys("10 civvil line");
		WebElement Welement1= driver.findElement(By.xpath("//label[text()='Female']"));
		System.out.println(Welement1.isDisplayed());
		driverWait.until(ExpectedConditions.visibilityOf(Welement1));
		Welement1.click();
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("farhanfarhanfarhan");

		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
				.ignoring(ElementNotVisibleException.class);
		
		//driver.findElement(By.className("driver.findElement"));
		//driver.findElement(By.className("driver.findElement").id("firstName")).sendKeys("farhan");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}
	}
	
