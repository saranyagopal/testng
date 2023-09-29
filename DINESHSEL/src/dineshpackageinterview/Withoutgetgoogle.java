package dineshpackageinterview;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutgetgoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
			
		
		JavascriptExecutor executor =(JavascriptExecutor) driver;
		executor.executeScript("window.location = \'"+url+"\'");
				//executor.executeScript(window.location = \'"+url+"\'", "");
		
	}

}
