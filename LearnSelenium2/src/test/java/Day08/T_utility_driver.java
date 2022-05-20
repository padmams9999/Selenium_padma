package Day08;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_utility_driver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 T_template_utility c1 = new T_template_utility();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get(c1.readProperties("URL"));			
			driver.manage().window().maximize();		
			
			driver.close();
    
	}

}
