package dineshpackageinterview;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertverify {
@Test
	public void asserttest() {
		System.out.println("before fails");
		Assert.assertEquals(true, false);//	Assert.fail();
		System.out.println("after fails");
		
	
	}

//verify or soft assertion
@Test
public void verify() {
	System.out.println("before verify");
	SoftAssert assert1 = new SoftAssert();
	assert1.fail();
	System.out.println("after verify");
}
}
