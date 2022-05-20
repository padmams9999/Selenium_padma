package day05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class L_wait_statements {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		String Exp_result ="733";
		
		System.out.println("Expected result is "+ Exp_result);
		
		//thread
		Thread.sleep(6000);
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//explicit wait
		//WebDriverWait ele_text = new WebDriverWait(driver, 60);
		//WebElement until = ele_text.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
	//	System.out.println(until.isDisplayed());
		//until.sendKeys("Iphone");
		
		
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
