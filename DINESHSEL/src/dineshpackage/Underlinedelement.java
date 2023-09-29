package dineshpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Underlinedelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement link = driver.findElement(By.xpath("//a[contains (text(), 'Google Cloud Next')]"));
		String beforeunderline = link.getCssValue("text-decoration");
		System.out.println(beforeunderline);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.perform();
		String afterunderline = link.getCssValue("text-decoration");
		System.out.println(afterunderline);
	}

}
