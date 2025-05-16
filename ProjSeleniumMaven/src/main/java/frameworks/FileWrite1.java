package frameworks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWrite1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	XSSFWorkbook w=new XSSFWorkbook();
	//XSSFWorkbook is predefined class from org.apache.poi package
	
	XSSFSheet sh=w.createSheet("DataDriven");
	//XSSFSheet is predefined class from org.apache.poi package
	//
	
	//Row is predefined Interface from org.apache.poi package
	
		Row r=sh.createRow(0);
		r.createCell(0).setCellValue("Username");
		r.createCell(1).setCellValue("Password");
		r.createCell(2).setCellValue("Status");
		
		
		Row r1=sh.createRow(1);
		r1.createCell(0).setCellValue("abcd");
		r1.createCell(1).setCellValue("1234");
		r1.createCell(2).setCellValue("Success");
		
	
		FileOutputStream f=new FileOutputStream("/Users/kshitijsalgarqa/Desktop/DataDriven.xlsx");
		//FileOutputStream is predefined class from java.io package
		//it is used to write data in excel sheet 
		//it store the location of excel sheet 
		
		w.write(f);
		
		
		
		
		
		
		
		
		
		
		
	}

}
