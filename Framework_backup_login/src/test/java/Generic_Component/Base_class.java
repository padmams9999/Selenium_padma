package Generic_Component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_class {
	
	public WebDriver driver;
	public static Logger log = Logger.getLogger(Base_class.class);
	
	@BeforeMethod
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		driver=new ChromeDriver();		
		driver.get("http://books.rediff.com");		
		driver.manage().window().maximize();
	}
	
	public void capture_screenshot(String TC_ID, String ORDER_SET) throws IOException
	{
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String formatedDate = df.format(date);
		String str = formatedDate + ".png";
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\screenshots\\" + TC_ID + "-" + ORDER_SET + "-"+str));
		
	}	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@BeforeTest
	public void runFirst()
	{
		log.info("************************Start**********************");
	}
	
	@AfterTest
	public void runLast()
	{
		log.info("************************End**********************");
	}
	
	

}
