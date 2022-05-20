package day05;

public class T_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // array --> variable which holds themultiple values of same data type
		//array -----> which holds duplicate data
		//arrayList -----> which holds duplicate data
		//one dimensional array
		String[] p= new String[5];
		p[0]="Apple";
		p[1]="Mango";
		p[2]="Banana";
		p[3]="Grapes";
		p[4]="watermelon";
		
		System.out.println(p[4]);
				 
		String v ="Mahendra singh dhoni is a great captain of India";
		String[] ele = v.split(" ");
		System.out.println(ele[2]);
	//************************************************************
		
		// Two dimensional array
		String[][] r = new String[2][5];
	
		r[0][0]="Apple";
		r[0][1]="Mango";
		r[0][2]="Banana";
		r[0][3]="Grapes";
		r[0][4]="watermelon";
		
		r[1][0]="Red";
		r[1][1]="Yellow";
		r[1][2]="Green";
		r[1][3]="Blue";
		r[1][4]="Black";
		 
		System.out.println(r[0][4]);
		System.out.println(r[1][2]);
		
		

	}

}
