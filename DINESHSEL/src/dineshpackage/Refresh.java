package dineshpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refresh {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.navigate().to("https://www.google.com");
		
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("fruit");
		driver.findElement(By.name("q")).sendKeys(Keys.F5);
		
		//driver.get(driver.getCurrentUrl());
		//refresh command
		//driver.navigate().refresh();
		
		//javascript executor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");
		executor.executeScript("history.go(0)");
		
		//robot class
		//Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_F5);
		//robot.keyRelease(KeyEvent.VK_F5);
		
		
		
	}

}
