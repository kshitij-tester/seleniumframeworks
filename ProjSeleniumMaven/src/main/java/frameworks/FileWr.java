package frameworks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileWr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
XSSFWorkbook w=new XSSFWorkbook();
XSSFSheet sh=w.createSheet("ABC");

Row r=sh.createRow(0);
r.createCell(0).setCellValue("ghj");
r.createCell(1).setCellValue("jncjcn");

FileOutputStream f=new FileOutputStream("/Users/kshitijsalgarqa/Desktop/DataDriven.xlsx");
w.write(f);


	}

}
