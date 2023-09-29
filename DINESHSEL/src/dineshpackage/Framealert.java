package dineshpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framealert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		Thread.sleep(2000);
		
	Alert button =	driver.switchTo().alert();
	
	button.sendKeys("Hello");
	
	System.out.println (button.getText());
	
	Thread.sleep(2000);
	
	button.accept();
		
		//driver.switchTo().defaultContent();
		
		driver.switchTo().parentFrame();
		
    System.out.println(driver.getTitle());
		
	}

}
