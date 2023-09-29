package testNG;

import org.testng.annotations.Test;

public class Cardemo {
	@Test(priority=0)
	
	public void startcar() {
		System.out.println("start car");
	}
	@Test(priority=1,enabled = false)
	public void firstgear() {
		System.out.println("firstgear car");
	}
	@Test(priority=2)
	public void secondgear() {
		System.out.println("secondgear car");
	}
	@Test(priority=3)
	public void thirdgear() {
		System.out.println("thirdgear car");
	}
}
