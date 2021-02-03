package TestNGLearning;

import org.testng.annotations.Test;

public class A1Attributeinvocationcount {

	@Test(invocationCount = 2)
	public void inc()
	{
		System.out.println("Expample for invocation count");
	}
	@Test
	public void inc2()
	{
		System.out.println("\n" +"Second test");
	}
	
	
}
