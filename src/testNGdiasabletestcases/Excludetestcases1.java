package testNGdiasabletestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Excludetestcases1 {
	@Test
	public void z1() {
		Reporter.log("a1 report",true);
	}
	@Test
	public void z2() {
		Reporter.log("a2 report",true);
	}
	@Test
	public void z3() {
		Reporter.log("a3 report",true);
	}
	@Test
	public void z4() {
		Reporter.log("a4 report",true);
	}

}
