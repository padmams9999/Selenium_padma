package Day08;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_multiple_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://www.naukri.com/");			
			driver.manage().window().maximize();			
			driver.findElement(By.className("mTxt")).click();
			
			//address of parent window
			String p_windw = driver.getWindowHandle();
			System.out.println(p_windw);
			System.out.println("*********************************************************");
			
			//address of child window
			Set<String> multi_windows = driver.getWindowHandles();
			
			System.out.println(multi_windows);
			
			for( String ele:multi_windows)
			{
				if(!ele.equals(p_windw))
				{
					driver.switchTo().window(ele);
					System.out.println(driver.getCurrentUrl());
					System.out.println(driver.getTitle());
					driver.close();
					
					driver.switchTo().window(p_windw);
					System.out.println(driver.getCurrentUrl());
					System.out.println(driver.getTitle());
					//driver.close();
					
				}
					
			}
			driver.quit();
		
		
			

	}

}
