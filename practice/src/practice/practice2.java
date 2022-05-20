package practice;

import java.util.Date;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hello World");
		
		String name="vardhaman";
		if(name=="pammu")
		{
		System.out.println("pammu is a mad girl");
		}
		else
		{
			System.out.println( name+ " is a good boy");
		}
		
		
		
		int a=10;
		System.out.println(a);
		
		for(int i=1;i<=10;i++) 
		{
			if(i==7)
			{
				break;
			}
			System.out.println(i);
			
		}
		
		System.out.println("executing while loop");
		
		int i=11;
		
		
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		
		String day="saturday";
		switch(day)
		{
		
		case "monday":
			System.out.println("Today is Monday");
			break;
			
		case "Tuesday":
			System.out.println("Today is Tuesday ");
			break;
			
		case "wed":
			System.out.println("Today is wed");
			break;
			
		case "thursday":
			System.out.println("Today is thursday");
			break;
			
		case "friday":
			System.out.println("Today is friday");
			break;
			
		case "saturday":
			System.out.println("Today is saturday");
			break;
			
			
		case "sunday":
			System.out.println("Today is sunday");
			break;
			
		default:
			System.out.println("invalid day");
			
		
		
		
		
		
		}

	}

}
