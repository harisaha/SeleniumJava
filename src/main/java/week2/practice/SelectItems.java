package week2.practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectItems {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//System.setProperty("webdriver.chromer.driver","C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/selectable.html");
	driver.manage().window().maximize();
	WebElement ele1 = driver.findElementByXPath("//li[text()='Item 1']");
	WebElement ele2 = driver.findElementByXPath("//li[text()='Item 2']");
	WebElement ele3 = driver.findElementByXPath("//li[text()='Item 3']");
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL).click(ele1).click(ele2).keyUp(Keys.CONTROL).perform();
}
}
