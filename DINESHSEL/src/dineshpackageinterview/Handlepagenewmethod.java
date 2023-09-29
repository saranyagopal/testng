package dineshpackageinterview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handlepagenewmethod {
	List<WebElement> nameselements ;
	@Test
	public void pagehandle() throws InterruptedException {
	
	System.setProperty("webdriver.Chrome.driver",
			"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
	nameselements = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
	
	
 List<String> storenames = new ArrayList<>();
 
 for (WebElement nameselement : nameselements) {
	 storenames.add(nameselement.getText());
	
}
 
 for (String name : storenames) {
	 System.out.println(name);
	
}
  
 
WebElement nextbutton = driver.findElement(By.id("example_next"));
String nextclassname = nextbutton.getAttribute("class");
	while(!nextclassname.contains("disabled"))
	{
	nextbutton.click();
	nameselements = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));	
	for (WebElement nameselement : nameselements) {
		storenames.add(nameselement.getText());
	}
	 nextbutton = driver.findElement(By.id("example_next"));
	 nextclassname = nextbutton.getAttribute("class");
	 
	}
	for (String name : storenames) {
		 System.out.println(name);
		
	}
	int totalnames = storenames.size();
	System.out.println("storedname size"+totalnames);
	String displaynumber =	driver.findElement(By.id("example_info")).getText().split(" ")[5];
	System.out.println("displaynumber"+displaynumber);
	
	Assert.assertEquals(displaynumber, String.valueOf(totalnames));
	Thread.sleep(2000);
	
	}

	
		
	}

	

