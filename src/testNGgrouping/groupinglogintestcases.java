package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupinglogintestcases {
	@Test(groups="log in")
	public void a1() {
		
		Reporter.log("test case login 1",true);
	}
	@Test(groups="log in")
	public void a2() {
		
		Reporter.log("test case login 2",true);
	}
	@Test
	public void a3() {
		
		Reporter.log("test case login 3",true);
	}
	@Test
	public void a4() {
		
		Reporter.log("test case login 4",true);
	}
	@Test(groups="log in")
	public void a5() {
		
		Reporter.log("test case login 5",true);
	}

}
