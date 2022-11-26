package testNG_My_Upstox;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClas extends BaseClass {
	
	upstoxpage1 obj1;
	upstoxpage2 obj2;
	upstoxpage3 obj3;
	upstoxpage4 obj4;
	   Sheet sh;
	
  @BeforeClass
  public void openbrowser () {
	    
		baseclas();
		
		obj1 = new upstoxpage1(driver);
	    obj2 = new upstoxpage2(driver);
	    obj3 = new upstoxpage3(driver);
	    obj4 = new upstoxpage4(driver);
  }
  
  @BeforeMethod
  public void loginuser () throws EncryptedDocumentException, IOException {
		
	obj1.userid(UtilityClass.exceldata(0, 0));
	
	obj1.password(UtilityClass.exceldata(0, 1));
	
	obj1.signclick();
	
	obj2.OTP(UtilityClass.exceldata(0,2));  
	
	obj3.welcome();
	
   }

  @Test
  public void m3 () throws EncryptedDocumentException, IOException {
		
	String aid = obj4.verify();
	
	String eid = UtilityClass.exceldata(0, 3);
	
	Assert.assertEquals(aid, eid);
	  
  }

	
  public void m4 () {
	  
  }

	
  public void m5 () {
	  
  }

	
  public void m6 () {
	  
  }

  

}
