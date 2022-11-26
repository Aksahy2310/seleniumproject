package testNGfailedtestcaseexcuetion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTC1 {
	@Test
	public void w1() {
		
	    Reporter.log("welcome 1",true);
	}
	@Test
	public void w2() {
		
		Reporter.log("welcome 1",true);
	}
	@Test
	public void w3() {
		Assert.fail();
		Reporter.log("welcome 1",true);
	}
	

}
