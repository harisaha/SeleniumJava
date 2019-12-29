package TestNGClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class ProjectSpecificMethods {
	ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"username","password"})
	public void methodCall(String uName,String pWord) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pWord);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	/*@BeforeMethod
	public void methodCall() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}*/
	/*@DataProvider
	public String[][] getData() {
		String[][] data = new String[2][3];
		data[0][0]="TATA";
		data[0][1]="Hari";
		data[0][2]="Saha";
		data[1][0]="Toyota";
		data[1][1]="Sachu";
		data[1][2]="Midhu";
		return data;
	}*/
}
