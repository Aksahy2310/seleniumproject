package testNGPOM_DDF_BASEclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utilityClass {
	
	public static String testdata (int RowNo,int CellNo) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstoxid&pwd.xlsx");
		Sheet sht =   WorkbookFactory.create(file).getSheet("Sheet1");
		String data =sht.getRow(RowNo).getCell(CellNo).getStringCellValue();
		
		return data;
		
		
	}

}
