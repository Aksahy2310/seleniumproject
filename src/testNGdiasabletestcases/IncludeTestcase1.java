package testNGdiasabletestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeTestcase1 {
	@Test
	public static void k1() {
		Reporter.log("jh1 report",true);
	}
	@Test
	public static void k2() {
		Reporter.log("jh2 report",true);
	}
	@Test
	public static void k3() {
		//Reporter.log("jh3 report",true);
		
		System.out.println("india");
	}
	@Test
	public static void k4() {
		Reporter.log("jh4 report",true);
	}
}
