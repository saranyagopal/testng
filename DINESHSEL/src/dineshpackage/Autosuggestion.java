package dineshpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()=\"From\"]")).click();
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
		Thread.sleep(2000);
		
		from.sendKeys("new york");	
		Thread.sleep(2000);
	from.sendKeys(Keys.ARROW_DOWN);
	
	Thread.sleep(2000);
	from.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	from.sendKeys(Keys.ENTER);
	
	
		
		
		
	}

}
