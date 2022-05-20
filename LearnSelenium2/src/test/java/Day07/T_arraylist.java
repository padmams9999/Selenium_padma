package Day07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class T_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arraylist ------> which holds duplicate value

				List<String> arr_list      =new ArrayList<String>();
				
				arr_list.add("mango");
				arr_list.add("banana");
				arr_list.add("grapes");
				arr_list.add("apple");
				arr_list.add("mango");
				
				//get size
				//System.out.println(arr_list.size());
				
				//fetching values using normal for loop
				for(int i=0; i<arr_list.size();i++)
				{
					//System.out.println(arr_list.get(i));
				}
				
				//fetching values using advanced for loop
				for(String ele :arr_list) 
				{
					//System.out.println(ele);
				}
				
				//fetching values using iterator
				Iterator<String> itr = arr_list.iterator();
				
				while( itr.hasNext())
				{
					System.out.println(itr.next());
				}
				
			}

		
		
		

	}


