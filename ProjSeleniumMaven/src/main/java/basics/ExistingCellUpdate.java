package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExistingCellUpdate {

	
	public static void main(String[] args) throws Exception {
		
		WebDriver d=new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		
		FileInputStream f=new FileInputStream(new File("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx"));
		XSSFWorkbook w=new XSSFWorkbook(f);
		XSSFSheet sh=w.getSheetAt(0);
		Row r;
		Cell c;
		int lastcell;
		
		XSSFCell cell;
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			
		cell=	sh.getRow(i).getCell(0);
		
		// Row 1 Column 0
		cell.setCellType(CellType.STRING);
		System.out.println(cell.getStringCellValue());
		d.findElement(By.xpath("//input[@name='username']")).sendKeys(cell.getStringCellValue());
			
		cell=	sh.getRow(i).getCell(1);
		cell.setCellType(CellType.STRING);
		System.out.println(cell.getStringCellValue());
		d.findElement(By.xpath("//input[@type='password']")).sendKeys(cell.getStringCellValue());
		
		d.findElement(By.xpath("//button[contains(.,'Login')]")).click();
		Thread.sleep(7000);
		
		try
		{
		
		WebElement invalid=d.findElement(By.xpath("//p[contains(.,'Invalid credentials')]"));
		
	//Excel write	
			 r= sh.getRow(i);
		        
		        if(r==null)
		        {
		        	r=sh.createRow(i);
		        	//row 1
		        }
		        
		   lastcell=r.getLastCellNum();
		        
		        //getLastCellNum is predefined method of Row
		        //it is used to check whether column value is null or empty or not
		        
		        if(lastcell==-1)
		        {
		        	lastcell=0;
		        }
		        
		       c=r.createCell(lastcell);
		        if(invalid.isDisplayed())
		        {
		        
		       
		        c.setCellValue("PASS");
		        }
		        else
		        {
				 c.setCellValue("FAIL");
		        }
		        
		}// try closing 
		catch(Exception e)
		{
			WebElement dashboard=d.findElement(By.xpath("(//span[contains(.,'Dashboard')])[1]"));
			
			if(dashboard.isDisplayed())
			{
                r= sh.getRow(i);
		        if(r==null)
		        {
		        	r=sh.createRow(i);
		        	//row 1
		        }  
		        lastcell=r.getLastCellNum();        
		        if(lastcell==-1)
		        {
		        	lastcell=0;
		        }
		        
				 c=r.createCell(lastcell);
				 c.setCellValue("PASS with valid inputs");
	        
			}
			
			
			
		}
		        
		        
		        FileOutputStream fo=new FileOutputStream("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx");
		        w.write(fo);
		
		
			
		}
	}	
	
	}


