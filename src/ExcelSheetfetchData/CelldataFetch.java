package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CelldataFetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\AK47.xlsx");
		
		 Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
		 
		int rno = sht.getLastRowNum();
		
		for(int i=0;i<=rno;i++) {
			
			String reslt = sht.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(reslt);
		}
			
		}
}
