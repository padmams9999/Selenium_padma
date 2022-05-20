package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_cssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
       String Exp_result ="735";
		
		System.out.println("Expected result is "+ Exp_result);
		
	//css selector	
		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Iphone");
		
		//xpath
	//	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		
       driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		
	   String Actual_result = driver.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small']")).getText();
	   

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
