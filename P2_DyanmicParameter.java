package TestNGLearning;

import java.util.List;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class P2_DyanmicParameter extends P1_ParameterStatic {

	@DataProvider(name="Lead")
	public String[][] getData()
	{
		String[][] data=new String[2][3];
		data[0][0]= "TestLeaf";
		data[0][1]="Gopi";
		data[0][2]="J";
		
		data[1][0]= "TestLeaf";
		data[1][1]="Babu";
		data[1][2]="M";
		
		return data;
				
	}
	
	@Test(dataProvider = "Lead")
	public void creatLead(String cName,String fName,String lname) throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		  WebElement company= driver.findElementById("createLeadForm_companyName");
		  company.sendKeys(cName);
		  driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		  driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		  
		 
		  
		  //enter the country value as India using Visible Text 
		  WebElement country =driver.findElementById("createLeadForm_generalCountryGeoId"); 
		  Select dropcountry= new Select(country); 
		  dropcountry.selectByVisibleText("India");
		  Thread.sleep(8000);
		  System.out.println("closing createLead");
		  driver.findElementByName("submitButton").click();
	}
	

}
