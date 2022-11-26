package POMclasswithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxTestclass {
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstox.xlsx");
	
	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login-v2.upstox.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
		
	upstoxpage1 obj1 = new upstoxpage1(driver);
	 String uid = sh.getRow(0).getCell(0).getStringCellValue();
	obj1.userid(uid);
	
	 String paswrd= sh.getRow(0).getCell(1).getStringCellValue();
	obj1.password(paswrd);
	
	obj1.signclick();
	Thread.sleep(2000);
	
	upstoxpage2 obj2 = new upstoxpage2(driver);
	 String pin= sh.getRow(0).getCell(2).getStringCellValue();
	obj2.OTP(pin);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    upstoxpage3 obj3 = new  upstoxpage3(driver);
	obj3.welcome();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	upstoxpage4 obj4 = new  upstoxpage4 (driver);
	 String actid = sh.getRow(0).getCell(3).getStringCellValue();
	 obj4.Accholdername(actid);
	}

}
