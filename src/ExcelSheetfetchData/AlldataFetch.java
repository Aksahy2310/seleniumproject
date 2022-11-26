package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AlldataFetch {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\AK47.xlsx");
		
	Sheet sht = WorkbookFactory.create(file).getSheet("Sheet1");
	
	int rsize = sht.getLastRowNum();
	int clsize=sht.getRow(0).getLastCellNum();
	
	for(int i=0;i<=rsize;i++) {
		
		int colsize = sht.getRow(i).getLastCellNum()-1;
	
		for(int j=0;j<=colsize;j++) {
			
			String prt = sht.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(prt+" ");
		}
		System.out.println();
		
	}
	}

}
