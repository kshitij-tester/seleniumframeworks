package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream f=new FileInputStream(new File("/Users/kshitijsalgarqa/Desktop/DataDriven.xlsx"));
		//FileInputStream is predefined class from java.io package
		//it is used to read excel file	
		
	XSSFWorkbook w=new XSSFWorkbook(f);
	//XXSFWorkbook is predefined class from org.apache.poi package
	
	XSSFSheet sh=w.getSheetAt(0);
	//XSSFSheet is predefined class from org.apache.poi package 
	
	XSSFCell cell;
	//XSSFCell is predefined class from org.apache.poi package 
	
	for(int i=0;i<=sh.getLastRowNum();i++)
	{
		cell=sh.getRow(i).getCell(0);
	//	Row 0, Column 0
		
		cell.setCellType(CellType.STRING);
		System.out.println(cell.getStringCellValue());
		
		cell=sh.getRow(i).getCell(1);
		//	Row 0, Column 1
			
			cell.setCellType(CellType.STRING);
			System.out.println(cell.getStringCellValue());
			
			cell=sh.getRow(i).getCell(2);
			//	Row 0, Column 2
				
				cell.setCellType(CellType.STRING);
				System.out.println(cell.getStringCellValue());
				
				
			
		
		
	}
	
	
	
	}

}
