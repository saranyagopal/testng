package testNG;

import org.testng.annotations.Test;
//run test cases only for moto and vivo

public class Group {
@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("apple testing");
	
	}
@Test(groups= {"Apple"})
	public void apple2() {
		System.out.println("apple testing");
	
	}
@Test(groups= {"moto"})
public void moto1() {
		System.out.println("moto testing");
	
	}
@Test(groups= {"moto"})
public void moto2() {
		System.out.println("moto testing");
	
	}
@Test(groups= {"vivo"})
	public void vivo1() {
		System.out.println("vivo testing");
	
	}
@Test(groups= {"vivo"})
	public void vivo2() {
		System.out.println("vivo testing");
}
@Test(groups= {"lenovo"})
		public void lenovo1() {
			System.out.println("lenovo testing");
		
		}
@Test(groups= {"lenovo"})
		public void lenovo2() {
			System.out.println("lenovo testing");
			
		}
	
	}

