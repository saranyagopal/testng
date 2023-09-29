package dineshpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleauthenticationpopup {
	
	public static String username="admin"; //reading from xls or csv
			public static String password="admin"; //reading from xls or csv  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
