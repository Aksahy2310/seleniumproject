package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupinglogout {
	
	@Test(groups="log out")
	public void a1() {
		
		Reporter.log("test case logout 1 ",true);
	}
	@Test(groups="log out")
	public void a2() {
		
		Reporter.log("test case logout 2",true);
	}
	@Test
	public void a3() {
		
		Reporter.log("test case logout 3",true);
	}
	@Test
	public void a4() {
		
		Reporter.log("test case logout 4",true);
	}
	@Test(groups="log out")
	public void a5() {
		
		Reporter.log("test case logout 5 ",true);
	}

}
