package dineshpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Activeelemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//driver.switchTo().activeElement().sendKeys("fruits \n");
		
		static WebElement q;
		PageFactory.initElements(driver, Activeelemnt.class);
q.sendKeys("fruit");

	}

}
