package TestNGLearning;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class L2_RetryFailedTestCast {
//	@Test(retryAnalyzer = L1_ReteyTestCase.class)
	@Test
	public void createLead()
	{
		System.out.println("createdLead");
		throw new NoSuchElementException();
	}
	
	@Test
	public void editLead()
	{
		System.out.println("editLead");
	}
}
