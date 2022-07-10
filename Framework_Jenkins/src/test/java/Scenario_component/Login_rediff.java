package Scenario_component;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Generic_Component.Base_class;
import PageObject_component.HomePage_ele;
import PageObject_component.SignIn_ele;

public class Login_rediff  extends Base_class{	
	
     // ********* Worked sucessfully on 09-07-2022 
	
	@Test(dataProvider ="dp_Invalidlogin" ,dataProviderClass = DataProvider_component.DataProvider_Login.class,groups = {"smoke"})
	public void test_Invalid_login(Map<String,String> map) throws IOException
	{
		//soft assertion
		SoftAssert sAssert = new SoftAssert();	
		
		// Click on Sign in
		HomePage_ele home_page	=  new HomePage_ele(driver);
		home_page.signInclick();
		
		//Enter UserID , password and click on login button
		SignIn_ele  signIn_page =new SignIn_ele(driver);		
		String username = map.get("UNAME");
		String password = map.get("PWD");		
		String TC_ID = map.get("TC_ID");
		String ORDER_SET = map.get("ORDER_SET");
		signIn_page.login(username, password);
		
		//start extent report
		extTest = extReport.startTest(TC_ID);
		extTest.log(LogStatus.PASS, "The execution of test case " + TC_ID + "order set is " + ORDER_SET);
		
		//StartExtentReport(TC_ID, ORDER_SET);
		
		//print using log4j
		log.info("The execution of test case " + TC_ID + "order set is " + ORDER_SET );
		
		//Get error message
		String Actual_result = signIn_page.getErrorMessage();
		String Expected_result = map.get("EXP_RESULT");
		
		//Compare result
		if(Actual_result.equals(Expected_result))
		{
			System.out.println("pass");
			log.info("passed and expected result is " + Expected_result + " and actual result is " + Actual_result  );
		extTest.log(LogStatus.PASS, "passed and expected result is " + Expected_result + " and actual result is " + Actual_result, extTest.addScreenCapture(capture_screenshot(TC_ID, ORDER_SET)));
			
		}
		else
		{
			System.out.println("fail");
			log.info("failed and expected result is " + Expected_result + " and actual result is " + Actual_result  );
			sAssert.fail("failed and expected result is " + Expected_result + " and actual result is " + Actual_result);
		    extTest.log(LogStatus.FAIL, "failed and expected result is " + Expected_result + " and actual result is " + Actual_result,extTest.addScreenCapture(capture_screenshot(TC_ID, ORDER_SET)));
			capture_screenshot(TC_ID , ORDER_SET);
		}
		  sAssert.assertAll();
	}

	@Test(dataProvider ="dp_Validlogin" ,dataProviderClass = DataProvider_component.DataProvider_Login.class,groups = {"smoke", "regression"})
	public void test_Valid_login(Map<String,String> map) throws IOException
	{
		//soft assertion
		SoftAssert sAssert = new SoftAssert();
		
		// Click on Sign in
		HomePage_ele home_page	=  new HomePage_ele(driver);
		home_page.signInclick();
		
		//Enter UserID , password and click on login button
		SignIn_ele  signIn_page =new SignIn_ele(driver);		
		String username = map.get("UNAME");
		String password = map.get("PWD");		
		String TC_ID = map.get("TC_ID");
		String ORDER_SET = map.get("ORDER_SET");
		signIn_page.login(username, password);
		
		//print using log4j
				log.info("The execution of test case " + TC_ID + "order set is " + ORDER_SET );
		
		//Get successful message
		String result = home_page.readMsg();
		String Expected_result = map.get("EXP_RESULT");
		String Actual_result = result.replace( " g", "");
		
		//Compare result
		if(Actual_result.equals(Expected_result))
		{
			System.out.println("pass");
			log.info("passed and expected result is " + Expected_result + " and actual result is " + Actual_result  );
		}
		else
		{
			System.out.println("fail");
			log.info("failed and expected result is " + Expected_result + " and actual result is " + Actual_result  );
			sAssert.fail("failed and expected result is " + Expected_result + " and actual result is " + Actual_result);
			capture_screenshot(TC_ID , ORDER_SET);
		}
		sAssert.assertAll();
	}
	
}
