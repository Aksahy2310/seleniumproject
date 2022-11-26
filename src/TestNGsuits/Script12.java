package TestNGsuits;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Script12 {
	
	@Test(priority=3)
	public void m3() {
		Reporter.log("test case 3 perform",true);
	}
	@Test(priority=4)
	public void m4() {
		Reporter.log("test case 4 perform",true);
	}

}
