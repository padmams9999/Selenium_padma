package Day08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class T_webTable_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");			
			driver.manage().window().maximize();
			Thread.sleep(3000);	
			
			List<WebElement> company_ele = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
			List<WebElement> country_ele = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
				
			//row count
           int ele_size = company_ele.size();
			
			for(int i=0 ; i <ele_size ; i++)
			{
				String company = company_ele.get(i).getText();
				//System.out.println(text);
				if(company.equals("Adobe"))
				{
					String country = country_ele.get(i).getText();
					System.out.println(company + " -- "+country);
				}
				
			}
			
			driver.close();
			
	}

}
