package week2.assignment;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		//driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByName("id").sendKeys(leadId);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String result = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		System.out.println(result);
		if(result.equals("No records to display")) {
			System.out.println("This is a successful deletion");
		}
		else {
			System.out.println("Deletion process is failed");
		}
		//driver.close();
	}
	
}
