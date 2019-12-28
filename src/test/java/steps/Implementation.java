package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	ChromeDriver driver;
	@Given("To launch the browser")
	public void toLaunchTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		// Initiate the ChromeBroswer
		driver = new ChromeDriver();
	}

	@Given("maximize the browser")
	public void maximizeTheBrowser() {
	    driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void loadTheURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter the username as (.*)")
	public void enterTheUsernameAsDemosalesmanager(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}

	@Given("Enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String pass) {
		driver.findElementById("password").sendKeys(pass);
	}

	@Given("click the login")
	public void clickTheLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("click crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click leads tab")
	public void clickLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	}

	@Given("click create lead button")
	public void clickCreateLeadButton() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter the company name as TATA")
	public void enterTheCompanyNameAsTATA() {
		driver.findElementById("createLeadForm_companyName").sendKeys("TATA");
	}

	@Given("Enter the First name as Hari")
	public void enterTheFirstNameAsHari() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Hari");
	}

	@Given("Enter the last name as Saha")
	public void enterTheLastNameAsSaha() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Saha");
	}

	@When("click the create lead button")
	public void clickTheCreateLeadButton() {
		driver.findElementByClassName("smallSubmit").click();
	}

	@Then("Verify create lead is perfomrmed successfully")
	public void verifyCreateLeadIsPerfomrmedSuccessfully() {
	    System.out.println("Success");
	}

}
