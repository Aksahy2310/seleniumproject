package testNGverification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertclassmethodEquals {
	
@Test
	public void m1() {
		
		String a1 = "akshay";
		String a2 = "Rushikesh";
	Assert.assertNull(a1);	
	Assert.assertNotNull(a1);
	Assert.assertEquals(a1,a2);
	Assert.assertNotEquals(a1, a2);
	System.out.println("akshay");
	
	}

@Test
   public void m2() {
	
	String k1= "akshay";
	String k2="aksah";
	Assert.assertNotEquals(k1, k2,"test case passed");}
@Test
    public void m3() {
	
	int a = 10;
	int b = 20;
	Assert.assertEquals(a,b);
}

}
