package Scenario_component;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.Base_class;
import PageObject_component.HomePage_ele;

public class Search_rediff extends Base_class {
	
	@Test(dataProvider = "dp_InvalidSearch",dataProviderClass = DataProvider_component.DataProvider_Login.class)
	public void test_InvalidSearch(Map<String,String> search) throws InterruptedException, IOException
	{
		SoftAssert sAssert = new SoftAssert();
		HomePage_ele home_page= new HomePage_ele(driver);
		
		String TC_ID = search.get("TC_ID");
		String ORDER_SET = search.get("ORDER_SET");
		String SEARCH_ITEM = search.get("SEARCH_ITEM");
		String EXP_RESULT = search.get("EXP_RESULT");
		
		home_page.search_item(SEARCH_ITEM);
		
		String Actual_result = home_page.getErrorSearch();
		
		if(Actual_result.equals(EXP_RESULT))
		{
			System.out.println("pass");
			log.info(" passed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);		
		}
		else
		{
			System.out.println("fail");
			log.info(" failed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);
			capture_screenshot(TC_ID, ORDER_SET);
			sAssert.fail(" failed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);
		}		
		sAssert.assertAll();		
	} //end of method
	
	@Test(dataProvider = "dp_ValidSearch",dataProviderClass = DataProvider_component.DataProvider_Login.class)
	public void test_ValidSearch(Map<String,String> search) throws InterruptedException, IOException
	{
		SoftAssert sAssert = new SoftAssert();
		HomePage_ele home_page= new HomePage_ele(driver);
		
		String TC_ID = search.get("TC_ID");
		String ORDER_SET = search.get("ORDER_SET");
		String SEARCH_ITEM = search.get("SEARCH_ITEM");
		String EXP_RESULT_1 = search.get("EXP_RESULT");
		Double	EXP_RESULT = Double.parseDouble(EXP_RESULT_1);
		
		home_page.search_item(SEARCH_ITEM);
		
		String Actual_result_1 = home_page.getSearch_item();
		Double  Actual_result =  Double.parseDouble(Actual_result_1);
		
	   if(Actual_result.equals(EXP_RESULT))
	   {
		   System.out.println("pass");
			log.info(" passed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);		   
	   }
		else
		{
			System.out.println("fail");
			log.info(" failed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);
			capture_screenshot(TC_ID, ORDER_SET);
			sAssert.fail(" failed - Expected result is " + EXP_RESULT + "Actual result is " + Actual_result);
		}		
		sAssert.assertAll();		
	}
	
}
