package TestNGClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CreateLead extends ProjectSpecificMethods{
	//Gopinath
	/*@BeforeClass
	public void setData() {
		excelFileName = "createLead";
	}*/
	
	/*@Test(dataProvider="getData")
	public void runCreateLead(String cName, String fName, String lName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByName("submitButton").click();*/
//		driver.close();
		
		
		@Test
		public void runCreateLead() {
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("TATA");
			driver.findElementById("createLeadForm_firstName").sendKeys("hari");
			driver.findElementById("createLeadForm_lastName").sendKeys("Saha");
			driver.findElementByName("submitButton").click();
	}
}






