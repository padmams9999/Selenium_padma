package practice;

import java.util.HashMap;
import java.util.Map;

public class P_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("vardhaman", "He is a good boy");
		map.put("padmashri", "She is a smart girl");
		map.put("reeya", "she is a excellent girl");
		
		//fetching the single data
		System.out.println(map.get("reeya"));
		
		//fetching all data
		for(Map.Entry var:map.entrySet()) 
		{
			System.out.println(var.getKey()+ " " + var.getValue());
		}

	}

}
