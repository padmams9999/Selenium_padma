package Day07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class T_tree_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//set ----> do not allow dublicate
				//treeSet----> which  maintain insertion order and also sorting
				
		        Set<String> H_set =new TreeSet<String>();
				 
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
