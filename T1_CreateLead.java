package TestNGLearning;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_CreateLead extends Class1{
	@Test(invocationCount = 2)
	public void creatLead() throws InterruptedException
	{
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		  WebElement company= driver.findElementById("createLeadForm_companyName");
		  company.sendKeys("TestLeaf");
		  driver.findElementById("createLeadForm_firstName").sendKeys("Praveen");
		  driver.findElementById("createLeadForm_lastName").sendKeys("Avin");
		  
		  WebElement dropdown1 = driver.findElementById("createLeadForm_dataSourceId");
		  Select source= new Select(dropdown1); source.selectByVisibleText("Employee");
		  Thread.sleep(5000);
		  
		  WebElement marketingcompain =driver.findElementById("createLeadForm_marketingCampaignId"); 
		  Select dropdown=new Select(marketingcompain); 
		  dropdown.selectByValue("CATRQ_CAMPAIGNS");
		  Thread.sleep(5000);
		  
		  WebElement industry =driver.findElementById("createLeadForm_industryEnumId"); 
		  Select dropdown3=new Select(industry);
		  
		  List<WebElement> options = dropdown3.getOptions(); 
		  int size= options.size();
		  dropdown3.selectByIndex(size-2); 
		  Thread.sleep(5000);
		  
		  // select the value by using selectByValue 
		  WebElement occupation =driver.findElementById("createLeadForm_ownershipEnumId"); 
		  Select drowoccupation=new Select(occupation);
		  
		  drowoccupation.selectByValue("OWN_CCORP"); Thread.sleep(1000);
		  
		  //enter the country value as India using Visible Text 
		  WebElement country =driver.findElementById("createLeadForm_generalCountryGeoId"); 
		  Select dropcountry= new Select(country); 
		  dropcountry.selectByVisibleText("India");
		  Thread.sleep(8000);
		  
		  driver.findElementByName("submitButton").click();
	}

}
