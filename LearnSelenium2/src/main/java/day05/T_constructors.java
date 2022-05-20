package day05;

public class T_constructors {
	
	  int a;
	  int b;
	
     	public T_constructors ()
	     {
		this.a=10;
		this.b =15;
	     }
	 
     	public   T_constructors(int a ,int b)
     	{
     		this.a=a;
     		this.b=b;
     	}
     	
     	public void setValue()
     	{
     		 a = 250;
     		 b = 150;
     	}
     	
     	public void add()
     	{
     		System.out.println(a+b);
     	}
	
	

}
