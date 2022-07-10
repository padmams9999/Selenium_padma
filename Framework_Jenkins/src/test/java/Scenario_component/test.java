package Scenario_component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hi Padma");

		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\drivers\\Chrome\\driver\\chromedriver.exe");

		
		
		driver.get("http://books.rediff.com");	
		
		Thread.sleep(5000);

	}

}
