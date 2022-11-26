package testNGverification;

import org.testng.annotations.Test;

import graphql.Assert;

public class AssertclassmethodNull {
	
	@Test
	public void a1() {
		
		float f= 21.4f;
		Assert.assertNull(f);
	}
	@Test
	public void a2() {
		
		String s = null;
		Assert.assertNull(s);
		}
	@Test
	public void a3() {
		
		String s = null;
		Assert.assertNotNull(s);
		}
}
