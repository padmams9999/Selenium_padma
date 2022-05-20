package DataProvider_component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.testng.annotations.DataProvider;

import Generic_Component.ExcelRW;



public class DataProvider_Login {   
	//login
	@DataProvider(name="dp_Invalidlogin")
	public static Iterator<Object[]> Invalid_login() throws IOException
	{
		 return common_logic("login","Invalid");		
	}
	
	@DataProvider(name="dp_Validlogin")
	public static Iterator<Object[]> Valid_login() throws IOException
	{
		 return common_logic("login","Valid");
	}
	
	//search_item
	@DataProvider(name="dp_InvalidSearch")
	public static Iterator<Object[]> Invalid_Search() throws IOException
	{
		 return common_logic("search","Invalid_search");		
	}
	
	@DataProvider(name="dp_ValidSearch")
	public static Iterator<Object[]> Valid_Search() throws IOException
	{
		 return common_logic("search","Valid_search");		
	}

	public static  Iterator<Object[]> common_logic(String sheetName,String sname ) throws IOException
	{
		ExcelRW c1= new ExcelRW("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\testData.xlsx");
		
		int row_count = c1.getRow(sheetName);
		int col_count = c1.getCol(sheetName);
		
		List<Object[]> arr_list = new ArrayList<Object[]>();
		
		for(int i=1; i <=row_count ; i++)
		{
			String execute_flag = c1.readCell(sheetName, i, 2);
			String scriptName = c1.readCell(sheetName, i, 3);
			if(execute_flag.equalsIgnoreCase("Y")&&(scriptName.equalsIgnoreCase(sname)))
			{
			Map<String, String> dmap=	new HashMap<String, String>();
			Object[] x= new Object[1];
			
					for(int j=0; j< col_count ; j++)
					{
						String key = c1.readCell(sheetName, 0, j);
						String value = c1.readCell(sheetName, i, j);
						 dmap.put(key, value);
						 x[0]=dmap;
					}	
					arr_list.add(x);
			}//if condition end			
		}//end for loop
	return	arr_list.iterator();	
		
	}
	

}
