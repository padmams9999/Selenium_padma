package Day07;

public class T_userDefined_exception_template {
	
	       int c;
	
			public int div( int a, int b) throws Exception
			{
				if( b==0)
				{
					throw new Exception("noting number is divisible by zero");
				}
				else
				{
					c= a/b;
				}
				 
				return c;
			}
	
	
	
	

}
