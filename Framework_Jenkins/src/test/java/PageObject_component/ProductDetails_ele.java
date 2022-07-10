package PageObject_component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_ele {
	
	//initialization of page factory
	 public ProductDetails_ele(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	 
	//element find
	 @FindBy(className  = "buynowbtnbig")
	  public WebElement buy_book;
	 
	//re_usable methods
	 public void buyBook()
	   {
		 buy_book.click();		
	   }
	

}
