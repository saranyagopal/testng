package dineshpackageinterview;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runfailedtestcase {

	//@Test(retryAnalyzer = Retry.class)
	@Test
	public void testcase1() {
		Assert.assertEquals(true, false);
	}
	@Test
	public void testcase2() {
		Assert.assertEquals(true, false);
	}
}
