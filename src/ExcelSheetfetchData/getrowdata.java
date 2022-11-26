package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowdata {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream fill=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\AK47.xlsx");
	
	Sheet shit = WorkbookFactory.create(fill).getSheet("Sheet1");
	
	int rno = shit.getRow(0).getLastCellNum()-1;
	
	for(int i=0; i<=rno;i++) {
		
		String value = shit.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value);
	}
	
	
	
	}

}
