package dineshpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPagescroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//scroll down
		/*
		 * executor.executeScript("window.scroll(0,400)", " "); Thread.sleep(2000);
		 * //scroll up executor.executeScript("window.scroll(0,-400)", " ");
		 * 
		 * Thread.sleep(3000); //go to bottom
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", " ");
		 * Thread.sleep(3000); //go to top executor.executeScript("window.scroll(0,0)",
		 * " ");
		 */
		//scroll to particular element
		WebElement seeall = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[10]/div[1]/div/div[2]/a"));
		executor.executeScript("arguments[0].scrollIntoView(true);", seeall);
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
	}

}
