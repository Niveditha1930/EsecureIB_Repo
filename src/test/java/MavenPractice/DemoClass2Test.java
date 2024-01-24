package MavenPractice;

import org.testng.annotations.Test;

public class DemoClass2Test {
	
	@Test(groups ={"smoke","regression"})
	public void run3Test()
	{
		System.out.println("---Test3---");
	}
	
	@Test(groups ="regression")
	public void run4Test()
	{
		System.out.println("---Test4---");
	}

}
