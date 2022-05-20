package day6;

import java.io.IOException;

public class L_access_modifier {

		// TODO Auto-generated method stub
		
    	private 	int add(int a, int b)
		   {  
		    	return a+b;
	    	}

    		int sub(int a, int b)
		   {  
		    	return a-b;
	    	}
 
    	protected 	int mul(int a, int b)
		   {  
		    	return a*b;
	    	}

    	public 	int div(int a, int b)
		   {  
		    	return a/b;
	    	}
    	
    	public static void main(String[] args)  
    	{
    		L_access_modifier c1 = new L_access_modifier();
    		
    		System.out.println(c1.add(7 , 8));
    		System.out.println(c1.sub(10 , 8));
    		System.out.println(c1.mul(2 , 5));
    		System.out.println(c1.div(25 , 5));
    		
    		
    		
    		
    		
         
	   }
}

