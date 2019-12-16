package week2.assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//Loading a url
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElementByXPath("//button[text()='✕']").click();
	Actions builder = new Actions(driver);
	WebElement hover = driver.findElementByXPath("//span[text()='Electronics']");
	WebElement miBrand = driver.findElementByXPath("(//a[text()='Mi'])[1]");
	builder.moveToElement(hover);
	Thread.sleep(3000);
	builder.click(miBrand).perform();
}
}
