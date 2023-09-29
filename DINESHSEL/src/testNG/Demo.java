package testNG;

import org.testng.annotations.Test;

public class Demo {
	@Test
	public void login() {
		System.out.println("login success");
	}

	@Test
	public void logout() {
		System.out.println("logout success");
	}
}
