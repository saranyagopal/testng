package dineshpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//Implicitwait//
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement electronic = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(electronic);
		action.perform();
		
		//Explicitwait//
	//WebDriverWait explicitwait =	new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
	//explicitwait.until(ExpectedConditions.visibilityOfElementLocated
			//(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		
	//Fluentwait//
			
		Wait<WebDriver> fluentwait =	new FluentWait<WebDriver>(driver)
	                                .withTimeout(Duration.ofSeconds(10))
		                            .pollingEvery(Duration.ofSeconds(2))
		                            .withMessage("hello")
		                            .ignoring(NoSuchElementException.class);
		                          
		fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"))).click();
		                            
	
	//WebElement games = driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[2]/a"));

		//games.click();
	}

}
