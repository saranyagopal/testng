package dineshpackageinterview;

import org.testng.annotations.Test;
//import org.testng.internal.thread.ThreadTimeoutException;
//import org.testng.internal.thread.ThreadTimeoutException;

public class Depensonfails {
	
	@Test(timeOut = 2000)
	public void parenttest() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("parent");
		
	}
	@Test(dependsOnMethods = "parenttest",alwaysRun = true)
	public void test() throws InterruptedException {
		
		System.out.println("lovers");
		
	}

}
