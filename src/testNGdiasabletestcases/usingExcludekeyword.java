package testNGdiasabletestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class usingExcludekeyword {
	@Test
	 public void a1 () {
		Reporter.log("test case 1 ",true);
	}
	
	@Test
	public void a2 () {
		Reporter.log("test case 2 ",true);
	}
	@Test
	public void a3 () {
		Reporter.log("test case 3 ",true);
	}
	@Test
	public void a4 () {
		Reporter.log("test case 4 ",true);
	}
	@Test
	public void a5 () {
		Reporter.log("test case 5 ",true);
	}
}
