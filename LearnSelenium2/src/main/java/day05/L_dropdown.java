package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bookshopofindia.com/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.name("searchon"));
		
		//Architectural code for dropdown
		Select slc = new Select(ele);
		
		//by index
		slc.selectByIndex(2);
		
		Thread.sleep(2000);
		
		//by value
		slc.selectByValue("Author");
		
		Thread.sleep(2000);
		
		//by visible text
		slc.selectByVisibleText("Title");
		
		Thread.sleep(2000);
		
		driver.close();		
		

		
		
		
		
	}

}
