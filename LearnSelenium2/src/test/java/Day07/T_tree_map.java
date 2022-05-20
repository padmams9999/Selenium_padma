package Day07;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class T_tree_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//map----> stores the data in form key  and do not allow duplicate
		//treeHashMap -----> maintain insertion order  and do sorting
		
		Map<Integer, String> Link_map = new TreeMap<Integer, String>();
		
		Link_map.put(2, "vardhaman");
		Link_map.put(1, "padmashri");
		Link_map.put(5, "namrata");
		Link_map.put(3, "reeya");
		Link_map.put(4, "varsha");
		
		Iterator<Integer> itr = Link_map.keySet().iterator();
		
		while(itr.hasNext())
		{
			 Integer skey = itr.next();
			 String str = Link_map.get(skey);
			System.out.println(skey + " " + str);
			
		}

	}

}
