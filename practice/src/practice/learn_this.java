package practice;

public class learn_this {
	
	int num1 = 10;
	int num2 = 20;
	
	public void test()
	{
		int num1=30;
		int num2 = 40;
		System.out.println("num1 -" + num1);
		System.out.println("num2 -" + num2);
		System.out.println("this.num1 -" + this.num1);
		System.out.println("this.num2 -" + this.num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		learn_this obj = new learn_this();
		
		obj.test();
		

	}

}
