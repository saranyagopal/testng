package dineshpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]")).click();
		Thread.sleep(2000);
		
		WebElement scrolldown = driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input"));
		Actions action = new Actions(driver);
		action.moveToElement(scrolldown);
		Thread.sleep(2000);
		action.perform();
		Thread.sleep(2000);
		
		driver.findElement(By.id("doi0")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("doi0")).click();
	}

}
