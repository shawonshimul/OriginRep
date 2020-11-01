package Sep19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream exo = new FileInputStream("C:\\Users\\shawon\\Desktop\\Test Data\\Sarj2.xlsx");
		XSSFWorkbook wbo = new XSSFWorkbook(exo);
		XSSFSheet wso = wbo.getSheet("sheet1");
		
		Row r;
		for(int i=0;i<=5;i++) {
			r=wso.createRow(i);
			r.createCell(0).setCellValue("Hero");
			r.createCell(1).setCellValue("Died");
		}
		FileOutputStream data = new FileOutputStream("C:\\\\Users\\\\shawon\\\\Desktop\\\\Test Data\\\\Sarj2.xlsx");
		wbo.write(data);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
