package day6;

public class L_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Class level
		L_mult obj1 = new L_mult();
		System.out.println(obj1.add(2, 4));
		
		//Interface level
		L_Interface  obj2 = new L_mult();
		System.out.println(obj2.sub(10, 8));
		
		//class level
		L_Div obj3 = new L_Div();
		System.out.println(obj3.div(9, 3));
		
		
		
		

	}

}
