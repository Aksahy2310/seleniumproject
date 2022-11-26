package TestNGsuits;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script11 {
	
	@Test(priority=1)
	public void m1() {
		Reporter.log("test case 1 perform",true);
	}
	@Test(priority=2)
	public void m2() {
		
		Reporter.log("test case 2 perform",true);
	}

}
