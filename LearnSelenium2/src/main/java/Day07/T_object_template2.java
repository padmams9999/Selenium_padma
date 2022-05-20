package Day07;

import org.openqa.selenium.By;

public class T_object_template2 extends T_object_template {

	public String searchyahoo(String search_item ) 
	{
		driver.findElement(By.xpath( "//input[ @name = 'p'] [ @ class = 'sbq']")).sendKeys(search_item);
		
		driver.findElement(By. xpath("// span [@ role ='button'] [ @ title = 'Search']")).click();
		
		String output = driver.findElement( By.xpath("//span [contains(text(),'results' )]")).getText();
		
		String[] arr = output.split(" ");
		String str = arr[1];
		System.out.println(str);
		return str;
	}
}
