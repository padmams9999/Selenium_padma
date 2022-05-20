package Generic_component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class {

	 private static final WebDriver TakesScreenshot = null;
	public WebDriver driver;
	 public static Logger log = Logger.getLogger(Base_class.class);
	
	@BeforeMethod
	public void launchApp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://books.rediff.com");		
		driver.manage().window().maximize();		
		//Thread.sleep(4000);
	}
	
	
	//take a screenshot
	public void capture_screenshot(String TC_ID,String ORDER_SET) throws IOException
	{
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String formated_date = df.format(date);
		String str=formated_date +".png";
		
		
		TakesScreenshot t_screen	= (TakesScreenshot) driver;
		File screenshotAs = t_screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\screenshots\\" + "screen-" +TC_ID + "-" + ORDER_SET + "-"  +str));
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
