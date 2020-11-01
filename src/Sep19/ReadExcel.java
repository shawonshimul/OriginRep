package Sep19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
	FileInputStream exof = new FileInputStream("C:\\Users\\shawon\\Desktop\\Test Data\\Sarj2b.xlsx");
	XSSFWorkbook wbos = new XSSFWorkbook(exof);
	XSSFSheet wsos = wbos.getSheet("sheet1");
	
	System.out.println(wsos.getRow(0).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(0).getCell(1).getStringCellValue());
	System.out.println(wsos.getRow(1).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(1).getCell(1).getStringCellValue());
	System.out.println(wsos.getRow(2).getCell(0).getStringCellValue());
	System.out.println(wsos.getRow(2).getCell(1).getStringCellValue());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
