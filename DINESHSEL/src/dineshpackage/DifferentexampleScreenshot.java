package dineshpackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentexampleScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Date date = new Date();
		System.out.println(date);
		
		String currentdate = date.toString().replace(" ", "-").replace(":", "-");
		System.out.println(currentdate);
		
		
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		 File sourcess=	screenshot.getScreenshotAs(OutputType.FILE);
		 
		FileUtils.copyFile(sourcess, new File(".//DifferentexampleScreenshot/"+currentdate+".png"));
		
		
		
	
	}

}
