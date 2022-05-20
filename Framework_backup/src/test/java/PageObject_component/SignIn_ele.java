package PageObject_component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignIn_ele {
	
	//Initialize the page Factory
		public SignIn_ele(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

    //create web_element
	@FindBy(name ="logid")
	public WebElement txt_userName;
	
	@FindBy(name="pswd")
	public WebElement txt_password;
	
	@FindBy(xpath ="//input[@value='Login']")
	public WebElement button_login;
	
	@FindBy(xpath ="//b[contains(text(),'Sorry we were unable')]")
	public WebElement error_msg;	
	
	// re_usable methods
	public void login( String username, String password)
	{
		txt_userName.sendKeys(username);
		txt_password.sendKeys(password);
		button_login.click();		
	}
	
	public String getErrorMessage()
	{
		String text = error_msg.getText();
		return text;
	}
	
}
