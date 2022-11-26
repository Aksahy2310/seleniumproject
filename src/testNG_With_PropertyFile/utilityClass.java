package testNG_With_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass {
	
	public static String testdata (int RowNo,int CellNo) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstoxid&pwd.xlsx");
		Sheet sht =   WorkbookFactory.create(file).getSheet("Sheet1");
		String data =sht.getRow(RowNo).getCell(CellNo).getStringCellValue();
		
		return data;
		}
	public static void getScreenhot(WebDriver driver ,int testid) throws IOException {
		
	File scr=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File f= new File("C:\\Users\\Admin\\Desktop\\Screenshot Script\\akshay"+testid+".jpg");
	
	FileHandler.copy(scr, f);
	}
	
	public static String getdatafrompropertyfile(String Key) throws IOException {
		
		FileInputStream fil = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium\\upstoxpropertiesfile.properties");
		
	   Properties p = new Properties();
	   
	   p.load(fil);
	   return p.getProperty(Key);
	
	
	
	}

}
