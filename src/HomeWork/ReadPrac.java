package HomeWork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPrac {

	public static void main(String[] args) throws IOException {
	
		File file = new File ("C:\\\\Users\\\\shawon\\\\Desktop\\\\Test Data\\\\TestSuiteMC2.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xbk = new XSSFWorkbook(fis);
		XSSFSheet xst = xbk.getSheet("TestCases");
		
		System.out.println(xst.getRow(0).getCell(0).getStringCellValue());
		System.out.println(xst.getRow(0).getCell(1).getStringCellValue());
		System.out.println(xst.getRow(0).getCell(2).getStringCellValue());
		System.out.println(xst.getRow(0).getCell(3).getStringCellValue());
		
	}
}
