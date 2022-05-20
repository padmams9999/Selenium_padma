package Day07;

public class T_encapsulation_template {
	
	private int age ;
	
	public int getAge()
	  {
		 return age ;
	  }
	
	public void setAge(int age)
	  {
		this.age =age ;
	  }
	
	private String agestate() 
	 {
		String status ;
		
		if (age>18)
		{
			status="major";
		}
		else
	    {
			   status="minor";
		}
		     
		         return status;
	 }

	    public String ageCalculator()
	    {
	    	return  agestate();
	    }
	

}
