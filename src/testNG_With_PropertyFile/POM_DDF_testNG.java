package testNG_With_PropertyFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_testNG extends Baseclass{
	
    upstoxpage1 obj1 ;
	upstoxpage2 obj2 ;
    upstoxpage3 obj3 ;
    upstoxpage4 obj4 ;
          Sheet sht;
       int testid;
   
	@BeforeClass
	public void openbrowser () throws EncryptedDocumentException, IOException, InterruptedException {
//		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Desktop\\Screenshot Script\\upstoxid&pwd.xlsx");
//		Sheet sht =   WorkbookFactory.create(file).getSheet("Sheet1");
		
		baseclass();

     	 obj1 = new upstoxpage1(driver);
		 obj2 = new upstoxpage2(driver);
	     obj3 = new upstoxpage3(driver);
	     obj4 = new upstoxpage4 (driver);
	    
	}
	@BeforeMethod
	public void login() throws IOException {
		
     	// String uid = sht.getRow(0).getCell(0).getStringCellValue();
	//	obj1.userid(utilityClass.testdata(0, 0));
		
		obj1.userid(utilityClass.getdatafrompropertyfile("UN"));
		
		// String paswrd= sht.getRow(0).getCell(1).getStringCellValue();
		//obj1.password(utilityClass.testdata(0, 1));
		
		obj1.password(utilityClass.getdatafrompropertyfile("PWD"));
		
		obj1.signclick();
	
		// String pin= sht.getRow(0).getCell(2).getStringCellValue();
		//obj2.OTP(utilityClass.testdata(0, 2));
		
		obj2.OTP(utilityClass.getdatafrompropertyfile("PIN"));
		
	    obj3.welcome();
		
	}
	@Test
	public void verifyuser() throws IOException {
		testid = 121;
	String actid = obj4.verify();  // actual id
    String expid = utilityClass.testdata(0, 3);  // excel sheet
  //  String expid = "abcd";
    Assert.assertEquals(actid, expid);
	
		
	}
	@AfterMethod
	public void capturescreenshot(ITestResult reslt) throws IOException {
		
		if(reslt.getStatus()==reslt.FAILURE) {
			
		
			utilityClass.getScreenhot(driver, testid);
		}
		
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
