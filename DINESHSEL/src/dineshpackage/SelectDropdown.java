package dineshpackage;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		
		driver.manage().window().maximize();
		//WebElement SelectDropdown = driver.findElement(By.xpath("//*[@id=\"field26\"]/div/select"));
	
		
		
		//get all links//
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getAttribute("href"));
			
			
			System.out.println(links.get(i).getText());
		}
			
		
//	Select dropdown = new Select(driver.findElement(By.name("employees_c")));
	
	//dropdown.selectByIndex(1);
	//Thread.sleep(2000);
	
	//dropdown.selectByValue("level5");
	//Thread.sleep(2000);
	//dropdown.selectByVisibleText("51 - 100 employees");
	//Thread.sleep(2000);
	
	
	//multi select
	//List<WebElement> multielements = dropdown.getAllSelectedOptions();
	//System.out.println(multielements);
	// System.out.println(multielements.size());
	
	//dropdown.deselectByIndex(1);
	//List<WebElement> multielements1 = dropdown.getAllSelectedOptions();
	//System.out.println(multielements1.size());
	
	
	
	
	
	

	}

}
