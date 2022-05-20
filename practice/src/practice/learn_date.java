package practice;

import java.text.SimpleDateFormat;
import java.util.*;

public class learn_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String report = "Test_Execution";
		System.out.println(report);
		
		Date obj = new Date();		
		SimpleDateFormat obj2 = new SimpleDateFormat("_dd_MM_yyyy_hh_mm_ss");
		
		String formatedDate = obj2.format(obj);
		System.out.println(formatedDate);
				
		System.out.println(report+formatedDate);

	}

}
