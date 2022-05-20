package Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_object {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.search.yahoo.com");
			
			String Exp_res = "13,200,000";
			System.out.println(Exp_res);
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath( "//input[ @name = 'p'] [ @ class = 'sbq']")).sendKeys("selenium");
			
			driver.findElement(By. xpath("// span [@ role ='button'] [ @ title = 'Search']")).click();
			
			String output = driver.findElement( By.xpath("//span [contains(text(),'results' )]")).getText();
			
			String[] arr = output.split(" ");
			String str = arr[1];
			System.out.println(str);
			
			if(str.equals(Exp_res))
	    	{
			           System.out.println("pass");
	     	} else
	         	{
	     		      System.out.println("fail");
	         	}
		
			
	/*		if(output.contains(Exp_res))
		    	{
				           System.out.println("pass");
		     	} else
		         	{
		     		      System.out.println("fail");
		         	}
			
			//driver.close(); */
			driver.close();
	}
}
