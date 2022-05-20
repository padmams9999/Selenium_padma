package practice;

import java.util.ArrayList;
import java.util.Collections;

public class learn_Array_Pammu {

	public static void main(String[] args) {
	
		 int arr[]= {10,20,30,40,50};
		 
		 arr[1]=100;
		 System.out.println(arr[1]);
		 
		 // get the size of array
		 
		// System.out.println(arr.length);

		 // print all element using for loop
		 
		 for(int i=0; i<arr.length; i++) 
		 {
			// System.out.println(arr[i]);
		 }
		 
		 //using advance for loop fetching all elements
		 
		 for(int ele:arr) 
		 {
			 //System.out.println(ele);
		 }
		 
		 //Learning array list
		 //store five fruits name and print it
		 ArrayList<String> list= new ArrayList<String>();
		 list.add("Mango");
		 list.add("Grape");
		 list.add("orange");
		 list.add("Banana");
		 list.add("Apple");
		 
		// System.out.println(list);
		 
		 
		 // print using normal for
		 for(int i=0;i<list.size();i++) 
		 {
			// System.out.println(list.get(i));
		 }
		 
		 // print using advanced for
		 
		 for(String ele:list) 
		 {
		   //System.out.println(ele);	 
		 }
		 
		 //getting element
		// System.out.println(list.get(4));
		 
		 // getting size
		// System.out.println(list.size());
		 
		 //adding element
		  list.set(3, "watermelon");
		// System.out.println(list.get(3));
		 
		 //sorting element by alphabetical order
		  Collections.sort(list);
		  for(String ele:list) 
			 {
			   System.out.println(ele);	 
			 }
		  
		  
		 
		 
		 
	}

}
