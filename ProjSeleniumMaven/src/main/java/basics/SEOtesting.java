package basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEOtesting {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String homeurl="https://www.flipkart.com/";
		String testurl="";
		HttpURLConnection htp=null;
		
		//200 TO 399 
		
		
		WebDriver d=new ChromeDriver();
		d.get(homeurl);
		Thread.sleep(2000);
		
		List<WebElement> sel=d.findElements(By.tagName("a"));
		
		Iterator<WebElement> iter=sel.iterator();
		
		
		
		FileInputStream f=new FileInputStream(new File("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx"));
        Workbook w=new XSSFWorkbook(f);
        Sheet sh=w.getSheetAt(0);
        
       
        
		
		
		
		
		
		
		
		while(iter.hasNext())
		{
			testurl=iter.next().getAttribute("href");
			
			
			
		        
		      
			
			
			
			//anchor tag 
			
			if(testurl==null || testurl.isEmpty())
			{
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
			        c.setCellValue(testurl+" anchor tag is not given");
				
				
				
				
				System.out.println(testurl+" anchor tag is not given");
				 continue;
			}
			
			//domain test
			//https://biodataking.com
			//https://signup.biodataking.com - invalid domain
			//https://biodataking.com/signup - valid domain
			
			if(!testurl.startsWith(homeurl))
			{
				System.out.println(testurl+" domain is incorrect");
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
		        c.setCellValue(testurl+" domain is incorrect");
			
			
			
			
			}
			
			
			htp=(HttpURLConnection)(new URL(testurl)).openConnection();
			htp.setRequestMethod("HEAD");
			htp.connect();
		int res=	htp.getResponseCode();
			
			
			if(res>=400)
			{
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
		        c.setCellValue(testurl+" is broken link");
			
			
				
				
				System.out.println(testurl+" is broken link");
			}
			else
			{
				
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
		        c.setCellValue(testurl+" is valid link");
			
			
				System.out.println(testurl+" is valid link");
			}
			
			  FileOutputStream fo=new FileOutputStream("/Users/kshitijsalgarqa/Desktop/FileKms.xlsx");
		        w.write(fo);	
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
