package dineshpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchresultlinks {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("fruit");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*
		 * search.sendKeys("fruit"); search.submit();
		 */
		//search.sendKeys("fruit"+Keys.ENTER);

/*
List<WebElement> allinks = driver.findElements(By.xpath("//a"));
 for (WebElement links : allinks) {
	System.out.println(links.getAttribute("href"));*/
	
//}
	
	 //get all main green color links
//List<WebElement> mainlinks = driver.findElements(By.xpath("//*[@role=\"text\"]//following::h3//following::div/cite"));
/*
List<WebElement> mainlinks = driver.findElements(By.xpath("//cite[@role=\"text\"]"));
System.out.println(mainlinks.getClass());



 * for (WebElement links : mainlinks) { System.out.println(links.getText());
 * 
 * }
 
	
}*/
	}
}
