package day6;

public class L_mult implements L_Interface {
	
	public int mult(int x, int y)
	{
		int res = x*y;
		return res;
	}
	
	
	public int add(int x, int y)
	{
		int res = x+y;
		return res;
	}
	
	public int sub(int x, int y)
	{	
		int res = x-y;
		return res;
	}

}
