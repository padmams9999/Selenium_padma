package Day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class T_excelReadWrite {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//create input file
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excelReadWrite.xlsx");
		
		//create XSSF work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//get sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//get rowcount
		int rowCount = sheet.getLastRowNum();
		
		// reading excel data
		for(int i=1 ; i <= rowCount; i++ )
	    	{
			String cellText="";
			//reading age column
			XSSFCell cell = sheet.getRow(i).getCell(1);
			
			if(cell.getCellType()==CellType.STRING)
			{
				cellText = cell.getStringCellValue();
			}
			if(cell.getCellType()==CellType.NUMERIC)
			{
			 cellText = String.valueOf(cell.getNumericCellValue());
			}
			if(cell.getCellType()==CellType.BLANK)
			{
				cellText="";
			}
			if(Double.parseDouble(cellText) >=18)
			{
				sheet.getRow(i).getCell(2).setCellValue("major");
			}
			else
			{
				sheet.getRow(i).getCell(2).setCellValue("minor");
			}
			
			
			
		    }//end of loop
		
		
		
		//save to file from wb
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Dell\\Desktop\\padmashri\\selenium\\New folder\\excelReadWrite.xlsx");
		fis.close();
		wb.write(fos);
		fos.close();
		
		

	}

}
