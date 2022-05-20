package Day07;

import org.testng.annotations.Test;

public class L_testNg {
	
	@Test(priority = 1)
	public void login()
	{
		int a=4/0;
		System.out.println("successfully login");
	}

	@Test(priority = 2 , dependsOnMethods = {"login"})
	public void sendmail()
	{
		System.out.println("successfully sent mail");
	}
	
	@Test(priority = 3 , dependsOnMethods = {"sendmail"})
	public void close()
	{
		//string to int
		Integer.parseInt("10");
		
		//int to string
		String.valueOf(25);
		
		System.out.println("successfully closed the application");
	}
}
