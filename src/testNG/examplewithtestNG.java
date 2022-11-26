package testNG;



import org.testng.Reporter;
import org.testng.annotations.Test;

public class examplewithtestNG {
	
	@Test
	public void m1 () {

	//	System.out.println("test case 1");
		Reporter.log("akshay kanase",true);
	
	}
	@Test
	public void m2() {
		
	 // System.out.println("test case 2");
		Reporter.log("vishal kanase",true);
	}
}
