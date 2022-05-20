package day05;

public class ddddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "100 results";
		String RStr = str.replace(" results", "");
		System.out.println("New -->" + RStr);
		
		String[] split = str.split(" ");
		System.out.println(split[0]);
		
		
		String str2 = str.trim();
		
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str.length());
		System.out.println(str2.length());

	}

}
