package practice;

public class Animal {
	
	public void print1()
	{
		
	}
	
	int a=10;
	int b=11;
	
	String name = "Vardhaman";
	
	public  void Getname()
	{
		System.out.println("this is parent method");
	}
	
	public static void Getname2()
	{
		System.out.println("this is static");
	}
	
	public void add(int a,int b)
	{
		System.out.println("this is first");
	}
	
	public void add(int a,int b, int c)
	{
		System.out.println("this is second");
	}
	
	public void mult(int a,int b)
	{
		int res = a*b;
		System.out.println(res);
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal obj = new Animal();

		
	}
	
	
	public Animal()
	{
		System.out.println("Calling constructor");
	}

}
