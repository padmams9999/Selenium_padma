package Day07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class T_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       //map----> stores the data in form key  and do not allow duplicate
				//HashMap ----->  do not  maintain insertion order  
				
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
				
				mp.put(1, "vardhaman");
				mp.put(2, "padmashri");
				mp.put(3, "namrata");
				mp.put(4, "reeya");
				mp.put(5, "varsha");
				
				Iterator<Integer> itr = mp.keySet().iterator();
				
				while(itr.hasNext())
				{
					 Integer skey = itr.next();
					 String str = mp.get(skey);
					System.out.println(skey + " " + str);
					
				}

			}

	}

