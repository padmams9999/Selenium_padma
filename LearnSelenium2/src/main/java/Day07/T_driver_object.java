package Day07;

public class T_driver_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Exp_res = "13,200,000";
		System.out.println(Exp_res);
		
		T_object_template2 obj = new T_object_template2();
		obj.launchApp();
		
		String Actual_res = obj.searchyahoo("selenium");
		
		if(Actual_res.equals(Exp_res))
    	{
		           System.out.println("pass");
     	} else
         	{
     		      System.out.println("fail");
         	}
		
		obj.tearDown();
	
		
		
		
		
		
		
		
		
		
		

	}

}
