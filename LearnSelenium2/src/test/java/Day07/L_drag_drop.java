package Day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.interactions.Actions;

public class L_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub.
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		WebElement ele_drag = driver.findElement(By.id("draggable"));
		
		WebElement ele_drop = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		
		actions.dragAndDrop(ele_drag, ele_drop).perform();
		Thread.sleep(2000);
		
		driver.close();

	}

}
