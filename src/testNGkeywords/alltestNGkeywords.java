package testNGkeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class alltestNGkeywords {

	@Test(priority=1)
	public void m1()
	{
		Reporter.log("Running TC1..",true);
	}
	@Test(priority=2)
	public void m2()
	{
		Reporter.log("Running TC2..",true);
	}
	
	@Test(timeOut=5000)    //duplicate priority
	public void m3() throws InterruptedException //testcase or test method
	{
		Thread.sleep(2000);
		Reporter.log("Running TC1...",true);
	}
	@Test    
	public void m4() //testcase or test method
	{
		Reporter.log("Running TC1...",true);
	}
	@Test(priority=2,invocationCount=3)    
	public void m5() //testcase or test method
	{
		Reporter.log("Running TC2...",true);
	}
	@Test(enabled=false)    
	public void m6() //testcase or test method
	{
		Reporter.log("Running TC3...",true);
	}
	@Test(enabled=false)    
	public void m7() //testcase or test method
	{
		Reporter.log("Running TC4...",true);
	}
	@Test(invocationCount=5)    
	public void m8() //testcase or test method
	{
		Reporter.log("Running TC1...",true);
	}
	
//	. TestNG Keywords 
//	1. invocationCount : Same Test Case Run Multiple Time 
//	        invocationCount=5; 
//
//	 2. priority : Set Execution Method Order
//	        priority=1 
//
//	 3. enabled : use to disable Test Method 
//			enable = false 
//
//	 4. TimeOut : Fail the Test Case if Time Consuming
//			@Test(timeOut=8000) 
//
//	 5. dependsOnMethods: If 1 TC depend upon other 
//	       dependsOnMethods= {"TC name"}
//	
}
