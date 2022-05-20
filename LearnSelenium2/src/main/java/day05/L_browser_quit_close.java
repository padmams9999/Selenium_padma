package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_browser_quit_close {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialshut.com/demo-website-for-selenium-automation-practice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	driver.findElement(By.id("cookie_action_close_header")).click();
		
		
		System.out.println("Text - "+ driver.findElement(By.xpath("//button[@id='button1']")).getText());
		
		driver.findElement(By.xpath("//button[@id='button1']")).click();
		
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		
		
		
		
	}

}
