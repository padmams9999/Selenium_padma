package Day07;

import java.io.IOException;

public class T_practice_excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		T_excel_generic obj	= new T_excel_generic();
		
		obj.T_excel_generic("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excelReadWrite.xlsx");
		
		int rowCount = obj.getRow("Sheet2");
		
		for( int i =1 ; i<= rowCount ;i++)
		{
			String age = obj.readCell("Sheet2", i, 1);
			
			double age_final = Double.parseDouble(age);
			
			if (age_final>=18)
			{	
				obj.writeCell("Sheet2", i ,2 ,"Major");
			}
			else
			{
				obj.writeCell("Sheet2", i ,2 ,"Minor");
			}
			
			obj.saveAndClose("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excelReadWrite.xlsx");
			
		}
		
//‪C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excelReadWrite.xlsx
		
		
	}

}
