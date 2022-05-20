package practice;

import java.util.HashMap;
import java.util.Map;

public class Learn_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Learn Map
		// Create Map and store key-value pairs
		
		HashMap<String, String> map = new HashMap<String,String>();
		
		map.put("Padma", "Sapate");
		map.put("vardhaman", "Mole");
		map.put("Omkar", "Mirje");
		map.put("Satish", "Kadavar");
		map.put("Rahul", "Madiwale");
		
		//Fetch single element from map
		//System.out.println(map.get("Omkar"));
		
		// fetch all values
				
		for(Map.Entry var:map.entrySet()) 
		{
			System.out.println(var.getKey() + " "+var.getValue());
		}
		
		
		
		
		
		
		
		
		
		

	}

}
