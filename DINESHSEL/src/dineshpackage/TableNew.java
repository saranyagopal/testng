package dineshpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		
		driver.manage().window().maximize();
		
		List<WebElement>  row =	driver.findElements(By.tagName("tr"));
		int rowsize = row.size();
		System.out.println("row:"+rowsize);
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int columnsize = column.size();
		System.out.println("column:"+columnsize);
		
		WebElement nextdata = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[2]//following::td[7]"));
		String text = nextdata.getText();
		System.out.println("next td:"+ text);
		
		
		
		List<Integer> numberlist = new ArrayList<Integer>();
		
		List<WebElement> all = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));
		for (WebElement columnfour : all) {
			
			String singlevalue = columnfour.getText();
		 String str1= new BigDecimal(singlevalue).setScale(3, Bigdecimal);
			//@SuppressWarnings("deprecation")
			String str = new BigDecimal(singlevalue).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
			
		int newsinglevalue =	Integer.parseInt(str);
			numberlist.add(newsinglevalue);
			
		int small = Collections.min(numberlist);
		System.out.println(small);
			
			
				
			
			
		}
		
		
		
		
		
		
		
		
		//td[normalize space()= 'A']//following::td[2]
	}
	

}
