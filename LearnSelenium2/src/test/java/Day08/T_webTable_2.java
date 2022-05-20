package Day08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class T_webTable_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");			
			driver.manage().window().maximize();
			Thread.sleep(3000);			
				
			//Read the web Elements			
			List<WebElement> Company_Web_Elements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
			List<WebElement> Country_Web_Elements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
			
			//System.out.println(Company_Web_Elements);
			//System.out.println(Company_Web_Elements.get(1));
			
			
			/*
			System.out.println("****************Get The Company Names**************");
			//Get The Company Names
			int CompanySize = Company_Web_Elements.size();
			for(int i=0; i<CompanySize ; i++)
			{
				String CompanyName = Company_Web_Elements.get(i).getText();
				System.out.println(CompanyName);				
			}
			
			
			System.out.println("****************Get The Country Names**************");
			//Get The Country Names
			int CountrySize = Country_Web_Elements.size();
			for(int i=0; i<CountrySize ; i++)
			{
				String CountryName = Country_Web_Elements.get(i).getText();
				System.out.println(CountryName);				
			}
			
			
			System.out.println("****************When you know the Microsoft location**************");
			String CompanyName1 = Company_Web_Elements.get(2).getText();
			System.out.println(CompanyName1);		
			
			
			System.out.println("****************When you know the Canada location**************");
			String CountryName1 = Country_Web_Elements.get(4).getText();
			System.out.println(CountryName1);		*/		
			
			
			System.out.println("***************Microsoft company is from which country ?***************");
			//Microsoft company is from which country		
			int CompanySize = Company_Web_Elements.size();
			for(int i=0; i<CompanySize ; i++)
			{
				String CompanyName = Company_Web_Elements.get(i).getText();
				
				
				if(CompanyName.equals("Microsoft"))
				{
					String CountryName = Country_Web_Elements.get(i).getText();
					System.out.println(CompanyName + " --> " +CountryName);		
					break;
				}	
			}		

	}

}
