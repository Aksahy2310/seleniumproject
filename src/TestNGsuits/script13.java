package TestNGsuits;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class script13 {
	
	@Test(priority=5)
	public void m5() {
		Reporter.log("test case 5 perform",true);
	}
	@Test(priority=6)
	public void m6() {
		Reporter.log("test case 6 perform",true);
	}

}
