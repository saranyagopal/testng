package dineshpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Table {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.Chrome.driver", "C:\\Users\\babud\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
			int rowsize = row.size();
			System.out.println("row:"+rowsize);
		
			List<WebElement> column = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
			int columnsize = column.size();
			System.out.println("column:"+columnsize);
			
			
			
			
			
			
			for (int i = 1; i <= row.size(); i++) {
				
				for (int j = 0; j <= column.size(); j++) {
					
					//WebDriverWait explicitwait =	new WebDriverWait(driver,Duration.ofSeconds(10));
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					//explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i+ "]/td["+ j +"]")");
						
						explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\"leftcontainer\\"]/table/tbody/tr[\"+ i+ \"]/td[\"+ j +\"]\");)))
					System.out.print(driver.findElement(By.xpath("//*[@id=\\\"leftcontainer\\\"]/table/tbody/tr[\"+ i+ \"]/td[\"+ j +\"]")).getText());				
					
					//WebElement rowcolumn = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ i +"]/td["+ j +"));
					//String alldata = rowcolumn.getText();
					//System.out.println("all rows and columns data:"+alldata);
					
					
					//WebElement valuei= rowcolumn.get(i);
					//valuei.getText();
			}
			
				
			}
			
	}

}
