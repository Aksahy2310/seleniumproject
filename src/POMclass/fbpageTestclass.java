package POMclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbpageTestclass {
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstox.xlsx");
	
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
     String U = sh.getRow(0).getCell(0).getStringCellValue();
     String P = sh.getRow(0).getCell(1).getStringCellValue();
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	fbpage1 obj1 = new fbpage1(driver);
		obj1.userId(U);
		obj1.password(P);
		Thread.sleep(3000);
		obj1.login();
	}

}
