package practice;

public class Wrapper_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Definition- Converting one data type to other data type called as wrapper class
		 
		 */
		//conversation of primitive data type to non primitive data type
		
		int a=453;
		String a_final= String.valueOf(a);
		System.out.println(a_final);
		
		double db=165.963;
		String db_final = String.valueOf(db);
		System.out.println(db_final);
		
		char p='p';
		String p_final = String.valueOf(p);
		System.out.println(p_final);
		
		/*Boolean b=true;
		String b_final=String.valueOf(b);
		System.out.println(b_final);
		*///--we can not resolve it
		
		
		// conversation of non primitive data type to  primitive data type
		
		String st="653";
        int st_final = Integer.parseInt(st);
        System.out.println(st_final);
        
        
        double st_final_double = Double.parseDouble(st);
        System.out.println(st_final_double);
        
        
        
       // string to char -- we can not resolve it
        
        String v="padmashri";
        boolean v_final = Boolean.parseBoolean(v);
        System.out.println(v_final);
        
        

	}

}
