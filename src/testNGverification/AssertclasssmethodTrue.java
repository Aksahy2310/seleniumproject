package testNGverification;

import org.testng.annotations.Test;

import graphql.Assert;

public class AssertclasssmethodTrue {
	@Test
	public void a1() {
		
		boolean actresult = true;
		Assert.assertTrue(actresult);
	}
    @Test
	public void a2() {
		
		boolean actresult1 = false;
		Assert.assertTrue(actresult1);
	}
    @Test
	public void a3() {
		
		boolean actresult = false;
		Assert.assertFalse(actresult);
	}  
    
    @Test
	public void a4() {
		
		boolean actresult = true;
		Assert.assertFalse(actresult);
	}
}
