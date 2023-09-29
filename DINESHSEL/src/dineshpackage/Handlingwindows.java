package dineshpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.xpath("//*[@id=\"1666820637520_9ph\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		System.out.println(parentwindow);
		
		String childwindow = iterator.next();
     	System.out.println(childwindow);
		
     	System.out.println("switching To:"+driver.switchTo().window(childwindow));
		
     	Thread.sleep(2000);
     	
		driver.findElement(By.name("UserFirstName")).sendKeys("saru");
		driver.findElement(By.name("UserLastName")).sendKeys("sara");
		
		
		
	}

}
