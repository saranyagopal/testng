package dineshpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://extendsclass.com/text-compare.html");
			driver.manage().window().maximize();
	WebElement source =	driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[8]/pre/span"));
	Actions action = new Actions(driver);
	
	action.keyDown(source, Keys.CONTROL);
	action.sendKeys("a").sendKeys("c").build().perform();
		}

}
