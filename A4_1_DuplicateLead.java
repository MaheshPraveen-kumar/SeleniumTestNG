package TestNGLearning;

import org.testng.annotations.Test;

public class A4_1_DuplicateLead extends Class1 {

	//@Test(dependsOnMethods = {"TestNGLearning.A4_CreateLead.creatLead"})
	@Test(dependsOnMethods = {"TestNGLearning.A4_CreateLead.creatLead"}, alwaysRun = true)
	public void duplicateLead() throws InterruptedException
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").clear();
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("babu@testleaf.com");
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
	}

}
