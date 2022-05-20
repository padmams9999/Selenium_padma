package Day08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://demo.guru99.com/test/web-table-element.php#");			
			driver.manage().window().maximize();		
			
			List<WebElement> company_elements = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
			List<WebElement> Prev_Elements = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
			
			System.out.println("*****"+Prev_Elements.get(1).getText());
			
			int count = company_elements.size();
			
			System.out.println(count);
			
			for(int i=0 ; i<count ; i++)
			{
				String CompanyName = company_elements.get(i).getText();
				System.out.println("CompanyName -->"+CompanyName);
				
				
				String CompanyName2 = company_elements.get(2).getText();
				
				if(CompanyName.contains(CompanyName2))
				{
					String pre_txt = Prev_Elements.get(i).getText();
					System.out.println(CompanyName+"--"+pre_txt);
					
				}
				
				
			}
			
		/*	for(WebElement ele:company_elements)
			{				
				String txt = ele.getText();				
				if(txt.equals("Jain Irrigation"))
				{
					System.out.println("pass");					
				}				
			}*/
			
			//driver.close();
			

	}

}
