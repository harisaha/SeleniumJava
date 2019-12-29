package week2.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	/*driver.get("http://www.leafground.com/pages/drag.html");
	driver.manage().window().maximize();
	WebElement drag = driver.findElementByCssSelector("#draggable");
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(drag, 100, 25).perform();*/
	driver.get("http://www.leafground.com/pages/drop.html");
	driver.manage().window().maximize();
	WebElement ele1 = driver.findElementById("draggable");
	WebElement ele2 = driver.findElementById("droppable");
	Actions builder = new Actions(driver);
	builder.dragAndDrop(ele1, ele2).perform();
}
}
