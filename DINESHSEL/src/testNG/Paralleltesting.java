package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Paralleltesting {
	@Test
	public void opengoogle() {
		System.setProperty("WebDriver.Chrome.driver", "C:\\\\Users\\\\babud\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com");
	}
	@Test
	public void openbing() {
		System.setProperty("WebDriver.Chrome.driver", "C:\\\\Users\\\\babud\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.bing.com/");
		
	}

}
