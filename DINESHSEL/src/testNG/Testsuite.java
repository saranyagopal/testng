package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testsuite {
	WebDriver driver;
	long startTime;
	long endtime;
	
	@BeforeTest
	public void openbrowser() {
	startTime = System.currentTimeMillis();
	
	System.setProperty("WebDriver.Chrome.driver", "C:\\\\Users\\\\babud\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	}
	//open chrome and launch googlea and yahoo
	
	@Test
	public void google() {
		
		driver.get("https://www.google.com");
	}
@Test
	public void yahoo() {
		
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.8.0");
}


		
		@AfterSuite
		public void closebrowser() {
		long endtime = System.currentTimeMillis();
		long totaltime = endtime-startTime;
		System.out.println("totaltime"+totaltime);
		driver.quit();
		
	}
}
