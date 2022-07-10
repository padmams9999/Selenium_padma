/* 
 * 
 * Author : Padmashri
 * 
 */

package Generic_Component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_class {
	
	public WebDriver driver;
	public static Logger log = Logger.getLogger(Base_class.class);
	public ExtentReports extReport;
	public ExtentTest extTest;
	 
	 Utility_class utility	=new Utility_class();
	 
	@BeforeMethod(groups = {"smoke","regression"})
	public void launchApp() throws IOException, InterruptedException
	{	
		
		System.out.println("inside >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String URL=	utility.readProperties("URL");
				
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\drivers\\Chrome\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		driver.get(URL);		
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		//reportExtent();
	}
	
	public String capture_screenshot(String TC_ID, String ORDER_SET) throws IOException
	{
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String formatedDate = df.format(date);
		String str = formatedDate + ".png";
		
		TakesScreenshot screen = (TakesScreenshot) driver;
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\screenshots\\" + TC_ID + "-" + ORDER_SET + "-"+str));
		String path = "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\screenshots\\" + TC_ID + "-" + ORDER_SET + "-"+str;
		return path;
	}	
	
	@BeforeSuite(groups = {"smoke","regression"})
	public void reportExtent()
	{
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		String formatedDate = df.format(date);
		String str2 = formatedDate + ".html";
		extReport = new	ExtentReports("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\extentReport\\" +"Extent-Report-"+str2,false );
	}
	
	
	/*public void StartExtentReport(String TC_ID,String ORDER_SET)
	{
		extTest = extReport.startTest(TC_ID);
		extTest.log(LogStatus.PASS, "The execution of test case - " + TC_ID + " - order set is - " + ORDER_SET);
	}*/
	
	@AfterMethod(groups = {"smoke","regression"})
	public void teardown()
	{
		driver.quit();
		extReport.endTest(extTest);
		extReport.flush();
	}
	
	@BeforeTest(groups = {"smoke","regression"})
	public void runFirst()
	{
		log.info("************************Start**********************");
	}
	
	@AfterTest(groups = {"smoke","regression"})
	public void runLast()
	{
		log.info("************************End**********************");
	}
	
	

}
