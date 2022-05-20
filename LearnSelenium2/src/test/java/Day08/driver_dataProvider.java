package Day08;

import java.util.Map;

import org.testng.annotations.Test;

public class driver_dataProvider {

	@Test(dataProvider = "dp_excel",dataProviderClass = Day08.template_dataProvider.class)
	public void add(Map<String,String> map)
	{
		String s1 = map.get("s1");
		String s2 = map.get("s2");
		String res = map.get("res");
		
		double num1 = Double.parseDouble(s1);		
		double num2 = Double.parseDouble(s2);
		double Actual_result=num1+num2;
		double Expected_res= Double.parseDouble(res);
		
		System.out.println("Actual_result - " +Actual_result + " " + "Expected_res - " + Expected_res);
		
		if(Actual_result==Expected_res)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	

}
