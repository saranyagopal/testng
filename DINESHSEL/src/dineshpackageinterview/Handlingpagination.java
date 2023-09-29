package dineshpackageinterview;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Handlingpagination {
	
@Test
	public void testpagination() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\babud\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		int noofpages = driver.findElements(By.cssSelector("#example_paginate>span>a")).size();
			
		List<String> storenames = new ArrayList<String>();
		for(int i=1;i<=noofpages;i++)
		{
			String pageselector = "#example_paginate>span>a:nth-child("+i+")";
					driver.findElement(By.cssSelector(pageselector)).click();
					List<WebElement> names = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
					System.out.println(names);
					for (WebElement name : names) {
						storenames.add(name.getText());
						
						//System.out.println(storenames);
						
					}
		}
		for (String singlename : storenames) {
			System.out.println(singlename);
		}
		
		int allnamessize = storenames.size();
		System.out.println("allnamessize"+allnamessize);
		
	String displaynumber =	driver.findElement(By.id("example_info")).getText().split(" ")[5];
	System.out.println("displaynumber"+displaynumber);
	Assert.assertEquals(displaynumber, String.valueOf(allnamessize));
	Thread.sleep(3000);
	driver.quit();
		
	}

}
