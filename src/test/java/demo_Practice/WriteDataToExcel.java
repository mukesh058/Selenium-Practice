package demo_Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {
	
	public static void main(String[] args) throws Exception {
		
		//specifiy file and For writing fileoutput
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Books.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Book1");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue("Java");
		row1.createCell(2).setCellValue(1000);
		
		
		XSSFRow row2 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Welcome hello");
		row1.createCell(1).setCellValue("Java");
		row1.createCell(2).setCellValue(2000);
		
		
		workbook.write(file);
		file.close();
		workbook.close();
		
		System.out.print("File created");
		
		
		
		
	}

}
