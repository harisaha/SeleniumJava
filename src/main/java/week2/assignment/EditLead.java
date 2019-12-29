package week2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//a[text()='Leads']").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Raj");
	
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	String title = driver.findElementByXPath("//div[text()='View Lead']").getText();
	if (title.contains("View Lead")) {
		System.out.println("Page title is "+title);
	} else {
		System.out.println("Page title is "+title+"mismatched");
	}
	driver.findElementByClassName("subMenuButton").click();
	WebElement comName = driver.findElementByXPath("//input[@id='createLeadForm_companyName']");
	comName.clear();
	comName.sendKeys("TATA");
	driver.findElementByXPath("//input[@value='Create Lead']").click();
	String companyName = driver.findElementById("viewLead_companyName_sp").getText();
	if (companyName.contains("TATA")) {
		System.out.println("Company name is "+companyName);
		driver.close();
	} else {
		System.out.println("Company name is "+companyName+"mismatched");
	}
	Thread.sleep(1000);
	driver.close();
	
}

}
