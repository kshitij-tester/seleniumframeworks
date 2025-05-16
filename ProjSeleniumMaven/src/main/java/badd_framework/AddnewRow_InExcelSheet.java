package badd_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class AddnewRow_InExcelSheet {

	
	
	@Test (priority=1)
	public void AddNewRow() throws Exception
	{
		FileInputStream f=new FileInputStream(new File("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx"));
        Workbook w=new XSSFWorkbook(f);
        Sheet sh=w.getSheetAt(0);
        
        Row r= sh.getRow(0);
        
        if(r==null)
        {
        	r=sh.createRow(0);
        }
        
        int lastcell=r.getLastCellNum();
        
        //getLastCellNum is predefined method of Row
        //it is used to check whether column value is null or empty or not
        
        if(lastcell==-1)
        {
        	lastcell=0;
        }
        
        Cell c=r.createCell(lastcell);
        c.setCellValue("Status");
        
        FileOutputStream fo=new FileOutputStream("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx");
        w.write(fo);
        
        System.out.println("Excel sheet value written successfully...");
        
        
        
        
        
	
	
	
	
	
	
	
	}
	

}
