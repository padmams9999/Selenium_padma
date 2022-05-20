package practice;

public class T_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="kallol chikodi belgavi karnataka mangur";
		
		String str2="Germeny";
		String str3=str+" "+str2;
		System.out.println(str3);
		
		int length2 = str.length();
		//System.out.println(length2);
		
		int var = str.indexOf("chikodi");
		//System.out.println(var);
		
		String[] split = str.split(" ");
		  
		for(String ele:split)
		{
			//System.out.println(ele);
		}
		
		String substring = str.substring(7,14);
		System.out.println(substring);
		
		String replace = str.replace("kallol", "bangalore");
		
		System.out.println(replace);
		

	}

}
