package LearnCucumber.LearnCucumber;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		// Initiate the ChromeBroswer
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
		driver.manage().window().maximize();
		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("toyato");
		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Shankar");
		// Select a drop down
		WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select source = new Select(dropDown);
		List<WebElement> list = source.getOptions();
		int countOfOpt = list.size();
		source.selectByVisibleText("Cold Call");
		Select campaignId = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		campaignId.selectByIndex(3);
		Select indId = new Select(driver.findElementById("createLeadForm_industryEnumId"));
		indId.selectByValue("IND_AEROSPACE");
		Select ownerShip = new Select(driver.findElementByName("ownershipEnumId"));
		ownerShip.selectByIndex(1);
		Select stateProv = new Select(driver.findElementById("createLeadForm_generalStateProvinceGeoId"));
		List<WebElement> listState = stateProv.getOptions();
		int c = listState.size();
		stateProv.selectByIndex(c-1);
		// Click on Create Lead (Submit) button
		driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name
		String checkName = driver.findElementById("viewLead_firstName_sp").getText();
		if (checkName.contains("Hari")) {
			System.out.println("success");
		}else {
			System.out.println("failure");
		}
	}

}
