package Scenario_component;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "var123@#";
		 String num = "";
		 String alpha = "";
		 String spl = "";
		 
	        System.out.println(str.length()); 
	        
	        for(int i =1; i<=str.length(); i++)
	        {
	            char str1 = str.charAt(i-1);
	            if(Character.isAlphabetic(str1))
	            {
	            	alpha = alpha + str1;
	            }else if(Character.isDigit(str1))
	            {
	            	num = num + str1;
	            }else
	            {
	            	spl = spl + str1;
	            }
	        }
	        
	        System.out.println("characters - " + alpha);
	        System.out.println("numbers - " + num);
	        System.out.println("special characters - " + spl);
	        
	        
	  
	        
	        

	}

}
