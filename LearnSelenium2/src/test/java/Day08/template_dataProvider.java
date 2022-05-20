package Day08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class template_dataProvider {
	
	@DataProvider(name="dp_excel")
	public static Iterator<Object[]> testAdd() throws IOException
	{
		T_excel_data_provider c1 = new T_excel_data_provider();
		c1.excel_load("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excel_sum.xlsx");
		
		int  row_count = c1.getRow("Sheet1");
		
		System.out.println(row_count);
		
		int col_count = c1.getCol("Sheet1");
		
		System.out.println(col_count);
		
		
		
		
		List<Object[]> arrList = new ArrayList<Object[]>();
		
		for(int i =1 ; i<=row_count ; i++)
		{	
			Map<String, String> dMap = new HashMap<String, String>();
			Object[] obj_arr	 = new Object[1];			
			
			for(int j =0 ; j< col_count; j++)
			{
				String key = c1.readCell("Sheet1",0 ,j );
				String value = c1.readCell("Sheet1",i ,j );
				dMap.put(key, value);				
			}	
			obj_arr[0] = dMap;		
			arrList.add(obj_arr);	
			
		}    //end for loop
				
		
		return arrList.iterator();
	}

}
