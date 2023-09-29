package dineshpackage;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		//file handler method to take ss
		
	//	TakesScreenshot screenshot = (TakesScreenshot) driver;
		//File sourcess = screenshot.getScreenshotAs(OutputType.FILE);
		//File destinationss = new File("D://sample.png");
		//FileHandler.copy(sourcess,destinationss);
		
		
		//robot class to take ss with entire url>another method when handling alert
		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage sourcess = robot.createScreenCapture(rectangle);
		File destinationss = new File("D://robot.png");
		ImageIO.write(sourcess, "png", destinationss);
		
		
	}

}
