package dineshpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Handlesslerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		
		//DesiredCapabilities sslerror = new DesiredCapabilities();
		//sslerror.setAcceptInsecureCerts(true);
		//sslerror.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		////sslerror.setCapability(CapabilityType.UNHANDLED_PROMPT_BEHAVIOUR, true);
		
		
		
		//ChromeOptions newchrome = new ChromeOptions();
		//newchrome.merge(sslerror);
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://expired.badssl.com/");
	}

}
