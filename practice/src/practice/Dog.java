package practice;

public class Dog extends Animal{
	
	String name = "PAMMU";
	
	
	public void test_super()
	{
		System.out.println("using super - " + super.name);
		
		System.out.println("without using super - " + name);
	}
	
	public void get() 
	{
		Getname();
	}
	public  void Getname()
	{
		System.out.println("this is child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Getname2();
		Dog obj = new Dog();
		//obj.Getname();
		//Animal obj2 = new Animal();
		obj.test_super();
		
		
		
}
}