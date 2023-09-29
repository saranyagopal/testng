package dineshpackage;

import org.openqa.selenium.By;

import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.WebElement;

public class Logintestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("background-color"));
		//driver.getTitle();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//String currenturl = driver.getCurrentUrl();
		//System.out.println(url);
//	driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		//driver.findElements(By.xpath("//div[@class=\"inventory_item\"]"));
		
		//driver.navigate().to("https://www.sugarcrm.com/");
	//	driver.getWindowHandle();
		//driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		//driver.findElement(By.partialLinkText("Get A Demo")).click();
		//driver.getWindowHandles();
		
		
		
		
	//WebElement password =	driver.findElement(By.id("password"));
	//RelativeLocator.with(By.tagName("input")).below(By.id("password"));
	
//	RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
	
		//driver.findElement(By.xpath("//a[text()=\"Privacy\"]")).click();
		//driver.findElement(By.xpath("//select[@id='CompanyEmployees-ygmE']//child::option")).click();
		
		
	//driver.findElement(withTagName)
	//WebElement username = driver.findElement(withTagName("input")).click();
	
		//driver.close();
	}

}
