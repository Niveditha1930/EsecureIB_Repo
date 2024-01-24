package MavenPractice;

import org.testng.annotations.Test;

public class DemoClass1Test {
	
	@Test(groups ="smoke")
	public void runTest()
	{
		System.out.println("---Test1---");
	}
	
	@Test(groups ="regression")
	public void run2Test()
	{
		System.out.println("---Test2---");
	}

	
}
