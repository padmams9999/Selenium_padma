package Day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set ----> do not allow dublicate
		//Hashset----> which do not  maintain insertion order
		
		 Set<String> H_set =new HashSet<String>();
		 
		 H_set.add("mango");
		 H_set.add("grapes");
		 H_set.add("banana");
		 H_set.add("apple");
		 H_set.add("mango");
		 
		 Iterator<String> itr = H_set.iterator();
		 
		 while(itr.hasNext())
		 {
			 String str = itr.next();
			 System.out.println(str);
		 }
		 
	
		 

		 
	}

}
