package ExcelSheetfetchData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcellSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\VCTC 2ndjulyB.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		Sheet sheet=wb.getSheet("Sheet1");
		for(int j=0;j<=2;j++)
		{
		for(int i=0;i<=2;i++)
		{
		//String actual=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
		//System.out.println(actual);
			Row row=sheet.getRow(i);
			Cell cell=row.getCell(j);
			System.out.println(cell.getStringCellValue());
			
			
		
		}
	}

	}}
