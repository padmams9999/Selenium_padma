package Day07;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L_className {
	
	WebDriver driver;

	@Parameters({"browser"})
	@Test
	public void amazon(String btype) throws MalformedURLException
	{	
		DesiredCapabilities cap = new DesiredCapabilities();
		
		if(btype.equals("sys1"))
		{
			cap.setCapability("browserName", "chrome");
			cap.setCapability("platformName", "WINDOWS");
		}
		else if(btype.equals("sys2"))
		{
			cap.setCapability("browserName", "firefox");
			cap.setCapability("platformName", "WINDOWS");
		}
			
		driver = new RemoteWebDriver( new URL("http://192.168.241.129/wd/hub"), cap);
	    
		
		
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		
		
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		String Exp_result ="733";
		
		System.out.println("Expected result is "+ Exp_result);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String  Actual_result = driver.findElement(By.className("sg-col-inner")).getText();
		
		System.out.println("Actual result is "+ Actual_result );
		
		if( (Actual_result).contains( Exp_result))
		{
			System.out.println("pass");
		}else
		{ 
			System.out.println("fail");
		}
		
		driver.close();

	}

}
