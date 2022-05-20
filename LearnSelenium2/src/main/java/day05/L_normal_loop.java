package day05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_normal_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.co.in");
			
			driver.manage().window().maximize();
			
			List<WebElement> ele = driver.findElements(By.tagName("a"));
			
			System.out.println(ele.size());
			
		    int flag =0;
		    
		    for(WebElement element:ele)
		    {
		    	//System.out.println(element.getText());
		    	
		    	if(element.getText().equals("Images"))
		    	{
		    		flag=1;
		    		break;
		    	}
		    	else
		    	{
		    		flag=0;
		    	}
		    }
			
			/*for(int i =0;  i<ele.size();  i++)
			{
				System.out.println(ele.get(i).getText());
			
				if(ele.get(i).getText().equals("   "))
					{
						flag=1;
						break;
					}
				else
					{
						flag=0;
					}
			} */
			
			if(flag==1)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			

			driver.close();

	}
	}

