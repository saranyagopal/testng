package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	
	
	String name ="saru";
	
	@Test
	
	public void assertname() {
	Assert.assertEquals(name, "saru");
	


	}
}
