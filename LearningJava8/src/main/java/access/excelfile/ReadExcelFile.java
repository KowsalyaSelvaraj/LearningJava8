package access.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\lap\\git\\LearningJava8\\LearningJava8\\CustomerData.xlsx");   //creating a new file instance  
		FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook wb = new XSSFWorkbook(fis);   
		XSSFSheet sheet = wb.getSheet("Data");
		int rowCount = sheet.getLastRowNum();
	
		for(int i=0;i<rowCount;i++) {
			Row row = sheet.getRow(i);
			int cellCount =  row.getLastCellNum();
			for(int j=0;j<cellCount;j++) {
				System.out.println(row.getCell(j).getStringCellValue());
			}
		}
		
		
		
		/*
		 * Iterator<Row> itr = sheet.iterator(); //iterating over excel file while
		 * (itr.hasNext()) { Row row = itr.next(); Iterator<Cell> cellIterator =
		 * row.cellIterator(); //iterating over each column while
		 * (cellIterator.hasNext()) { Cell cell = cellIterator.next(); //field that
		 * represents string cell type System.out.print(cell.getStringCellValue() +
		 * "\t\t\t");
		 * 
		 * } }
		 */

	}
}

