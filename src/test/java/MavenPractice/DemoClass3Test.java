package MavenPractice;

import org.testng.annotations.Test;

public class DemoClass3Test {
	
	@Test(groups ="regression")
	public void run5Test()
	{
		System.out.println("---Test5---");
	}
	
	@Test(groups ="smoke")
	public void run6Test()
	{
		System.out.println("---Test6---");
	}

}
