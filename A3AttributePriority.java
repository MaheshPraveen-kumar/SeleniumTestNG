package TestNGLearning;

import org.testng.annotations.Test;

public class A3AttributePriority {
	
	
	@Test(invocationCount = 2 ,priority = 2)
	public void cl()
	{
		System.out.println("cl test");
	}
	@Test(priority = 3)
	public void el()
	{
		System.out.println("edit test");
	}
	@Test(priority = 3)
	public void dl()
	{
		System.out.println("delete test");
	}
	@Test(priority = -4)
	public void dul()
	{
		System.out.println("duplicate test");
	}
	@Test
	public void mergl()
	{
		System.out.println("merge test");
	}
}
