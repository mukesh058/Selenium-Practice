package demo_Practice;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*Excel file >> Workbook >> sheet >> Row >> Cell
XSSFWorkbook -- Workbook 
XSSFSheet --  Sheet
XSSFRow  -- Row 
XSSFCell  -- Cell*/

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\datatest.xlsx");
//		System.out.println(file.read());
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
//		if we want to directly access 2nd row and 1st cell
//		String cellentry = sheet.getRow(2).getCell(1).toString();
//		System.out.println(cellentry);
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("no. of rows   "+totalRows);
		System.out.println("total no of cells   "+totalCells);
 		
//		For loop is used for reading all data form execl
		
		for(int r=0; r<=totalRows;r++)
		{
			XSSFRow currentrow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell currentCell = currentrow.getCell(c);
				System.out.print(currentCell+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		
	}
}
	