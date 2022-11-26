package testNGfailedtestcaseexcuetion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failtestcases {
	@Test
	public void m1() {
		
		Reporter.log("test case 1 pass",true);
	}
	@Test
	public void m2() {
		
		Reporter.log("test case 2 pass",true);
	}
	@Test
	public void m3() {
	//	Assert.fail();
		Reporter.log("test case 3 pass",true);
	}
	@Test
	public void m4() {
	//	Assert.fail();
		Reporter.log("test case 4 pass",true);
	}
}
