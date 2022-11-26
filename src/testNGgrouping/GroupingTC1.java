package testNGgrouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingTC1 {
	@Test(groups = "log in",priority=3)
	public void az() {
		
	   Reporter.log("login related tc ",true);
		
	}
	
	@Test(groups = "logout")
	public void az1() {
		
	   Reporter.log("login related tc 1 ",true);
		
	}
	
	@Test(groups = "log in",priority=2)
	public void az2() {
		
	   Reporter.log("login related tc 2 ",true);
		
	}
	
	@Test(groups = "logout")
	public void a3() {
		
	   Reporter.log("logout related tc 3 ",true);
		
	}
	
	@Test(groups = "log in",priority=1)
	public void a4() {
		
	   Reporter.log("login related tc 4 ",true);
		
	}
	

}
