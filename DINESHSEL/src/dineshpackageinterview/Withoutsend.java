package dineshpackageinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutsend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.name("q"));
		//executor.executeScript("document.getElementsByName('q')[0].value='saru'", " ");
		
		executor.executeScript("arguments[0].value='sara'", search);
	}

}
