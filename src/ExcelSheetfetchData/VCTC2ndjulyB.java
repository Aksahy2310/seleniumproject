package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VCTC2ndjulyB {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream qw=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\VCTC 2ndjulyB.xlsx");
		
	String as=WorkbookFactory.create(qw).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	System.out.println(as);
	}

}
