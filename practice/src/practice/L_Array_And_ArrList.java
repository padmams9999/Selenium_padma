package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class L_Array_And_ArrList {

	public static void main(String[] args) throws InterruptedException {
		
		int a = 2;
		int b = 10;
		int c = 15;
		
		// Declare array and initiation
		int arr[] = {1,2,3,4,5};

		
		// Access array elements
		//System.out.println(arr[1]);
		
		// Add elements dynamically
		//arr[5]=6;
		//System.out.println(arr[5]);
		
		//access using for loop
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println(arr[i]);
		}
		
		//access using for each loop
		for(int ele:arr)
		{
			//System.out.println(ele);
		}
		
		
		
		
		// ********* ArrayList ****************
		
		ArrayList<String> list = new ArrayList<String>();
		
		// Add Elements
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Chikoo");
		list.add("Santara");
		
		//Print list
		//System.out.println(list);
		
		//Print only one element using get
		//System.out.println(list.get(1));
		
		// Update using set
		//list.set(2, "Watermelon");
		//System.out.println(list.get(2));
		
		
		// Fetch the elements using for loop
		for(int i=0; i<list.size() ; i++)
		{
			//System.out.println(list.get(i));
		}
		
		
		// Fetch the elements using Advanced for loop
		for(String ele:list)
		{
			//System.out.println(ele);
		}
		
		
		// sorting
		Collections.sort(list);
		for(String ele:list)
		{
			System.out.println(ele);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
