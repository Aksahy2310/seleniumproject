package testNGverificationSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertequal {
	@Test
	public void abc() {
		
		String s1 = "akshay";
		String s2 = "akshay";
		
		SoftAssert soft = new SoftAssert();
	     soft.assertNull(s1);
	     System.out.println("akshay k");
	     soft.assertEquals(s1,s2);
	     System.out.println("vishal k");
	     soft.assertNotEquals(s1,s2);
	     System.out.println("ak");
	     
	     soft.assertAll();
	}

}
