package day05;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L_practise_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Hello ,  I am good");
		
	      // System.setProperty("webdriver.chrome.driver", "‪D:\\padmashri\\selenium\\new_Version\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\new_Version\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			WebElement buttonLocator = driver.findElement(By.xpath("//input[@value='Google Search']"));
			
			//get parameters
			int Xcord = buttonLocator.getLocation().getX();
			int Ycord = buttonLocator.getLocation().getY();
			
			int width = buttonLocator.getSize().getWidth();
			int height = buttonLocator.getSize().getHeight();
			

			
			Date  date =  new Date();
			System.out.println(date);
			
			SimpleDateFormat simple_date_formate = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
			String formated_date = simple_date_formate.format(date);
			String str = formated_date+".png";
			
			//screenshot
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File TempImage = screenshot.getScreenshotAs(OutputType.FILE);			
			System.out.println(TempImage);
			
			//Get subImage
			//Image read
			BufferedImage img = ImageIO.read(TempImage);
			BufferedImage subimage = img.getSubimage(Xcord, Ycord, width, height);
			//write image
			ImageIO.write(subimage, "png", TempImage);
			
			FileUtils.copyFile(TempImage, new File("‪‪D:\\padmashri\\selenium\\screenshot\\" + "TestCase"   + str  ));
			driver.close();
		
	}

}
