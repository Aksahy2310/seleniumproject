package testNGfailedtestcaseexcuetion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class failedtestclass {
	@Test
	public void m1() {
		Reporter.log("test case m1..",true);
	}
	@Test
	public void m2() {
		Reporter.log("test case m2..",true);
	}
	@Test
	public void m3() {
		//Assert.fail();
		Reporter.log("test case m3..",true);
	}
	@Test
	public void m4() {
	//	Assert.fail();
		Reporter.log("test case m4..",true);
	}

}
