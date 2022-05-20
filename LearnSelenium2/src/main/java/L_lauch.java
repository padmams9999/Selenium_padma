import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_lauch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Create Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Launch URL
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Wait 10 seconds
		Thread.sleep(10000);
		
		

	}

}
