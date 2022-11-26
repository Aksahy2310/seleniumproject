package testNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlltestNGannotation {
	
	@BeforeClass
	public void m2 () {
		Reporter.log("open the broser",true);
	}
	@BeforeMethod
	public void m3() {
		Reporter.log("login app",true);
	}
	@Test
	public void m4() {
		Reporter.log("verify the  1st user",true);
	}
	@Test
	public void m5() {
		Reporter.log("Verify the 2nd user",true);
	}
	@AfterMethod
	public void m6() {
		Reporter.log("logout the !st user",true);
	}
    @AfterTest
	public void m7() {
		Reporter.log("close browserr ",true);
	}
    
    

}
