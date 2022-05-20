package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bing.com");
		
		driver.manage().window().maximize();
		
		String Exp_result ="4190000";
		
		System.out.println("Expected result is "+ Exp_result);
		
		driver.findElement(By.name("q")).sendKeys("sachin");
		
		driver.findElement(By.id("search_icon")).click();
		
		//wait
			String Actual_result = driver.findElement(By.className("sb_count")).getText();
		
		Thread.sleep(2000);
		
		//1st way - results delete
		//String act1 = Actual_result.replace(" Results", "");
		//System.out.println("replace - "+act1);
		//String act2 = act1.replace(",", "");
		//System.out.println(act2);
		
		//2nd way to splits space
	//	String string = Actual_result.split(" ")[0];
		
	//	System.out.println("Actual result is "+ Actual_result );
		
		String[] arrList = Actual_result.split(" ");
		String var = arrList[0];
		
		String var2 = var.replace(",", "");
		System.out.println("act res - "+var2);
	if( (var2).contains( Exp_result))
		{
			System.out.println("pass");
		}else
		{ 
			System.out.println("fail");
		} 
		
		driver.close();
		
		
		
		


	}

}
