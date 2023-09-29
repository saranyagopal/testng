package dineshpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Maximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		driver.get("https://www.google.com");
		//Dimension dimension = new Dimension(1000, 800);
		//driver.manage().window().setSize(dimension);
		
		
		
	}

}
