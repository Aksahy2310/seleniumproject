package testNGPOMwithDDF2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class upstoxexamplewithPOM_DDF_testNHG {
	
	upstoxpage1 obj1 ;
	upstoxpage2 obj2 ;
    upstoxpage3 obj3 ;
    upstoxpage4 obj4 ;
    Sheet sht;
    WebDriver driver;
    
	@BeforeClass
	public void openbrowser () throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\UPproject.xlsx");
		Sheet sht =   WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\ChromeDriver\\chromedriver107.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login-v2.upstox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

     	 obj1 = new upstoxpage1(driver);
		 obj2 = new upstoxpage2(driver);
	     obj3 = new upstoxpage3(driver);
	     obj4 = new upstoxpage4 (driver);
	    
	}
	@BeforeMethod
	public void login() {
		
		 String uid = sht.getRow(0).getCell(0).getStringCellValue();
		obj1.userid(uid);
		
		 String paswrd= sht.getRow(0).getCell(1).getStringCellValue();
		obj1.password(paswrd);
		
		obj1.signclick();
	
		 String pin= sht.getRow(0).getCell(2).getStringCellValue();
		obj2.OTP(pin);
		
	    obj3.welcome();
		
	}
	@Test
	public void verifyuser() {
		
	String actid = obj4.verify();
    String expid = sht.getRow(0).getCell(3).getStringCellValue();
    
    Assert.assertEquals(actid, expid,"passed");
	
		
	}
	@AfterMethod
	public void logout() {
		
		Reporter.log("logout",true);
		
	}
	@AfterClass
	public void closebrowser() {
		driver.close();
		 obj1 = null;
		 obj2 = null ;
	     obj3 = null ;
	     obj4 = null ;
	      sht  = null;
	   driver = null;
	    
		
	}

}
