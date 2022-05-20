package Day07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_object_template {

	WebDriver driver;
	 public void launchApp()
	 {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
			
				driver = new ChromeDriver();
					
					driver.get("https://www.search.yahoo.com");
					
					driver.manage().window().maximize();
	 }
	
	 public void tearDown()
	 {
		 driver.quit();
	 }
	
	
	   
}
