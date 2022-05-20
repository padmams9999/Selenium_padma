package Day07;

import java.util.HashMap;
import java.util.Iterator;

public class T_hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "padmashri");
		hashMap.put(2, "vardhaman");
		hashMap.put(3, "reeya");
		
		System.out.println(hashMap.get(3));

	//	for(int i=0; i<hashMap.size();i++)
		{
			//System.out.println([);
		}
		
	//	for( <Integer, String> ele:hashMap.getOrDefault(hashMap, null))
		{
		//System.out.println(ele);
		}
		Iterator<Integer> itr = hashMap.keySet().iterator();
		
		while(itr.hasNext())
		{
			Integer skey = itr.next();
			System.out.println( skey+ " "+ hashMap.get(skey));
		}
		
	}

}
