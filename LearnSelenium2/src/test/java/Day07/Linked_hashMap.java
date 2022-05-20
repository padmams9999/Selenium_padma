package Day07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map----> stores the data in form key  and do not allow duplicate
		//LinkedHashMap -----> maintain insertion order
		
		Map<Integer, String> Link_map = new LinkedHashMap<Integer, String>();
		
		Link_map.put(1, "vardhaman");
		Link_map.put(2, "padmashri");
		Link_map.put(3, "namrata");
		Link_map.put(4, "veena");
		Link_map.put(5, "varsha");
		
		Iterator<Integer> itr = Link_map.keySet().iterator();
		
		while(itr.hasNext())
		{
			 Integer skey = itr.next();
			 String str = Link_map.get(skey);
			System.out.println(skey + " " + str);
			
		}
		}

	}


