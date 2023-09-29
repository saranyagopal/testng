package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Test
	@Parameters("NAME")

	public void printname(String Name) {
		System.out.println(Name);
	}
}
