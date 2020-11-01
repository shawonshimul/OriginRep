package Sep19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcLoop {

	public static void main(String[] args) throws IOException {


		File file = new File("C:\\\\Users\\\\shawon\\\\Desktop\\\\Test Data\\\\Sarj2b.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wbk = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbk.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum() +1;
		//count the row and column
		//fetch the data of the row and column
		for (int i=0; i<rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<row.getLastCellNum();j++) {
				System.out.println(row.getCell(j));
			}
	System.out.println();	
	
		}
		fis.close();
		wbk.close();
	
	
	}

}
