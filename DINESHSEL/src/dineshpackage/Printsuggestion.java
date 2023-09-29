package dineshpackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printsuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("game of thrones");

		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		//int position = 0;
		
		
		for (WebElement webElement : suggestions) {
			String text = webElement.getText();
			System.out.println(text);
			// click on the 3rd position result
			/*
			 * position++; if (position ==3 ) { webElement.click(); //break;
			 * 
			 * 
			 * 
			 * 
			 * 
			 * }
			 */
			
			//click suggestion contains cast text
			
				
				if(text.contains("cast")) {
					webElement.click();
					break;
					
				}
			

		}

	}
}
