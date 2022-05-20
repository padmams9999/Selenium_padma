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
	
	   @FindBy(id = "srchword")
	   public WebElement txt_search;
	   
	   @FindBy(className  = "newsrchbtn")
	   public WebElement btn_search;
	   
	   @FindBy(id  = "find")
	   public WebElement success_result;
	   
	   @FindBy(xpath = "//p[@class='sorrymsg']/b")
	   public WebElement error_result;
	   
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
	   
	   public void search_item(String SEARCH_ITEM)
	   {
		   txt_search.sendKeys(SEARCH_ITEM);
		   btn_search.click(); 		   
	   }
	   
	   public String getSearch_item()
	   {		   
		  return  success_result.getText();
	   }
	   
	   public String getErrorSearch() throws InterruptedException
	   {		 
		    return error_result.getText();
	   }
	
}
