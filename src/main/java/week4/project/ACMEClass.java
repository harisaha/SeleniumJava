package week4.project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACMEClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://acme-test.uipath.com/account/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
	driver.findElementById("password").sendKeys("leaf@12");
	driver.findElementById("buttonLogin").click();
	WebElement vendorElement = driver.findElementByXPath("//i[@class='fa fa-truck']/parent::button");
	WebElement searchElement = driver.findElementByXPath("//a[text()='Search for Vendor']");
	Actions builder=new Actions(driver);
	builder.moveToElement(vendorElement).perform();
	builder.click(searchElement).perform();
	driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	driver.findElementById("buttonSearch").click();
	WebElement table = driver.findElementByXPath("//table[@class='table']");
	List<WebElement> row = table.findElements(By.xpath("//table[@class='table']/tbody/tr/following-sibling::tr"));
	System.out.println(row.size());
	List<WebElement> col = row.get(0).findElements(By.tagName("td"));
	for (int i = 0; i < col.size(); i++) {
		System.out.println(col.size());
		System.out.println(col.get(i).getText());
		if (i==4) {
			
		
		if (col.get(4).getText().equals("France")) {
			String a = col.get(4).getText();
			System.out.println("o/p -->" +a);
		}
		else {
			System.out.println("Mismatched result.");
		}
		}
	}
	driver.findElementByXPath("//a[text()='Log Out']").click();
	driver.close();
	
	
}
}
