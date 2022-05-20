package practice;

import java.util.ArrayList;

public class L_String {

	public static void main(String[] args) {
		// String
		
		char ch[]= {'v','a','r','a','d'};
		
		//System.out.println(ch);
		
		//2nd method
		
		String str = new String(ch);
		//System.out.println(str);
		
		//3rd method
		
		String val = "varad";
		//System.out.println("Value -->" + val);
		
		// Size of string
		//System.out.println("Sixe of str --> " + val.length());
		
		//position of char
		//System.out.println("position of "+val.indexOf("r"));
		
		//concatination
		String val2 = "Mole";
		
		//System.out.println(val.concat(val2));
		//System.out.println(val + val2);
		
		// Learn sub string
		String Var = "Padma went to Brussels and it went located in Europe";
		
		String cut = Var.substring(6,9);
		//System.out.println(cut);
		
		//Split - break the string
		String arr[] = Var.split(" ");
		
		//System.out.println("printing array");
		for(String str3 : arr)
		{
			
			//System.out.println(str3);
		}
		
		// check availability
		String search_Ele = "and";
		int pos = Var.indexOf(search_Ele);
		System.out.println("position of --> " + pos);
		
		if(pos != -1)
		{
			System.out.println("passed");
		}else
		{
			System.out.println("Failed");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
