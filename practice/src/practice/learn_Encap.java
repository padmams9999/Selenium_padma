package practice;

public class learn_Encap {
	
	private String name ;
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int add(int a, int b)
	{
		int res =a+b;
		return res;
	}
	
	
	public static void main(String[] args)
	{
		learn_Encap obj = new learn_Encap();
		
		obj.setName("padma");
		
		String var = obj.getName();
		System.out.println(var);
		
		int res2 = obj.add(5, 8);
		System.out.println(res2);
		
	}
	
	
	
	
	
}
