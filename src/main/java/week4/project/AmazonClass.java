package week4.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonClass {
	public static void main(String[] args) throws InterruptedException {
		String errMessage = "Enter your email or mobile phone number";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		driver.findElementByXPath("//span[@id='nav-search-submit-text']/following-sibling::input").click();
		List<WebElement> result = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		System.out.println(result.size());
		for (WebElement eachResult : result) {
			System.out.println(eachResult.getText());
		}
		for (int i = 0; i < result.size(); i++) {
			if (i==0) {
				String a = result.get(i).getText();
				driver.findElementByXPath("//span[contains(text(),'"+a+"')]").click();
			}
		}
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lstWin = new ArrayList<String>(windowHandles);
		String newWin = lstWin.get(1);
		driver.switchTo().window(newWin);
		System.out.println(driver.getTitle());
		WebElement element = driver.findElementByXPath("(//i[@class='a-icon a-icon-star a-star-4-5'])[1]");
		Actions builder = new Actions(driver);
		builder.moveToElement(element).perform();
		Thread.sleep(5000);
		String rating = driver.findElementByXPath("(//span[@class='a-size-medium a-color-base a-text-beside-button a-text-bold'])[1]").getText();
		System.out.println("Customer rating is "+rating);
		driver.findElementById("add-to-cart-button").click();
		String text = driver.findElementByXPath("//div[@id='huc-v2-order-row-confirm-text']/h1").getText();
		System.out.println(text);
		if (text.equals("Added to Cart")) {
			System.out.println("SUCCESS");
		}
		else {
			System.out.println("FAILURE");
		}
		driver.findElementById("hlb-ptc-btn-native").click();
		String title = driver.getTitle();
		if (title.equals(title)) {
			System.out.println("Title is expected.");
		}else {
			System.out.println("Incorrect tiltle is displayed.");
		}
		driver.findElementByXPath("//input[@id='continue']").click();
		String errMsg = driver.findElementByXPath("//div[@id='auth-email-missing-alert']/div/div").getText();
		System.out.println(errMsg);
		if (errMsg.equals(errMessage)) {
			System.out.println("Correct message is displayed.");
		} else {
			System.out.println("Incorrect message is displayed.");
		}
		driver.quit();
	}


}
