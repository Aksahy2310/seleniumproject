package testNG_My_Upstox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class UtilityClass {
	
	public Sheet sh;
	
	public static String  exceldata (int Rno,int Cno) throws EncryptedDocumentException, IOException {
		
    FileInputStream f = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\MyupstoxAccount.xlsx");
		
    Sheet sh = WorkbookFactory.create(f).getSheet("Sheet1");
	  
	String data = sh.getRow(Rno).getCell(Cno).getStringCellValue();  
	
	return data;
		
	}

}
