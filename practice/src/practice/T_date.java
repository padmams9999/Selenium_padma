package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date.*;


public class T_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String rep="report";
		
		Date obj=new Date();
		System.out.println(obj);
		
		SimpleDateFormat obj2=new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		
		String format = obj2.format(obj);
		
		System.out.println(rep+" "+format);
		
	}

}
