package Scenario_component;

import java.sql.Time;
import java.util.Map;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.Base_class;
import PageObject_component.Cart_page;
import PageObject_component.HomePage_ele;
import PageObject_component.ProductDetails_ele;

public class Cart_rediff extends Base_class {
	
	@Test(dataProvider = "dp_Cart",dataProviderClass = DataProvider_component.DataProvider_Login.class,groups = {"smoke"})
	public void cart(Map<String,String> cart) throws InterruptedException
	{
		SoftAssert sAssert = new SoftAssert();
		String SEARCH_ITEM = cart.get("SEARCH_ITEM");
		String TC_ID = cart.get("TC_ID");
		String ORDER_SET = cart.get("ORDER_SET");
		String EXP_RESULT = cart.get("EXP_RESULT");
		
		
		HomePage_ele home_page = new HomePage_ele(driver);
		home_page.search_item(SEARCH_ITEM);
		
		Thread.sleep(5000);
		
		home_page.selectBook();
		
		ProductDetails_ele product_detail = new ProductDetails_ele(driver);
		product_detail.buyBook();
		
		Cart_page cart_page = new Cart_page(driver);
		String Actual_result  = cart_page.getCartText();
		
		if(Actual_result.equals(EXP_RESULT))
		{
			log.info("passed - EXP_RESULT - " + EXP_RESULT + "Actual_result" + Actual_result);
		}
		else
		{
			log.info("failed - EXP_RESULT - " + EXP_RESULT + "Actual_result" + Actual_result);
			sAssert.fail("failed - EXP_RESULT - " + EXP_RESULT + "Actual_result" + Actual_result);
		}			
		sAssert.assertAll();		
	}

}
