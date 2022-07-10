package PageObject_component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_page {
	
	//initialization of page factory
		 public Cart_page(WebDriver driver)
		   {
			   PageFactory.initElements(driver, this);
		   }
		 
		//element find
		 @FindBy(xpath  = "//b[contains(text(),'You are in:')]")
		  public WebElement cartText;
		 
		//re_usable methods
		 public String getCartText()
		   {
			return cartText.getText();			 
		   }

}
