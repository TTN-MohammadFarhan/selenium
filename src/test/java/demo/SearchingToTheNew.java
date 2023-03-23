package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchingToTheNew {
	
		public static void main(String... agrs)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad Farhan\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//upcasting
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tothenew.com/contact-us");
			System.out.println("title of page"+driver.getTitle());
			System.out.println("url of page"+driver.getCurrentUrl());

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
