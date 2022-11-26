package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Booleandatafetch {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream  as=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\New Microsoft Office Excel Worksheet.xlsx");
	
	String zx=WorkbookFactory.create(as).getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();

System.out.println(zx);

		
	}
}
