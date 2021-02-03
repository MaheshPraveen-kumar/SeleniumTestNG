package TestNGLearning;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class A4_Attribute_Group 
{
	@Test(groups = {"functional"},dependsOnGroups = "smoke")
	public void test1()
	{
		System.out.println("test1");
	} 
	
	@Test(groups = {"regression"})
	public void test2()
	{
		System.out.println("test2");
	}
	
	
	
	@Test(groups = {"functional","smoke"},dependsOnGroups = "smoke" )
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(groups = {"regression","functional"},dependsOnGroups = "smoke")
	public void test5()
	{
		System.out.println("test5");
	}
	@Test(groups = {"functional","regression"})
	public void test6()
	{
		System.out.println("test6");
	}
	@Test(groups = {"regression","functional"})
	public void test7()
	{
		System.out.println("test7");
	}
	
	@Test(groups = {"smoke"})
	public void test3()
	{
		System.out.println("test3");
		throw new NoSuchElementException();
	}
}
