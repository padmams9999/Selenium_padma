package PageObject_component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



   public class HomePage_ele {
	   
    //initialize pagefactory
	   public HomePage_ele(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	  
	   //create web_elements
	   //@FindBy(linkText = "Sign In")
	 
	   @FindBy(xpath = "//span[@id='sigin_info']/a[1]")
	   public WebElement link_signIn;
	   
	   @FindBy(id = "username")
	   public WebElement userName;
	
	   //re-usable methods
	   public void signInclick()
	   {
		link_signIn.click();		
	   }
	
	   public String readMsg()
	   {
		String text = userName.getText();
		return text;
		}	
	
}
