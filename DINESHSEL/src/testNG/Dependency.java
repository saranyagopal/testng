package testNG;

import org.testng.annotations.Test;

public class Dependency {
	@Test(enabled = false)
	
	public void highschool() {
		System.out.println("highschol");
	}
	@Test(dependsOnMethods = "highschool")
	public void college() {
		System.out.println("highschol");
	}
}
