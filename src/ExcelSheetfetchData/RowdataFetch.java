package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowdataFetch {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\AK47.xlsx");
	
	Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
	
	int Rnum = sht.getRow(0).getLastCellNum()-1;
	
	for(int i=0;i<=Rnum;i++) {
		
		String valu = sht.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(valu+" ");
	}

}}
