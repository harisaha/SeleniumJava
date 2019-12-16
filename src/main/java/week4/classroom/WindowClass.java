package week4.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowClass {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.manage().window().maximize();
	driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	List<String> lstwindowHandles  = new ArrayList<String>(windowHandles);
	String lastWin = lstwindowHandles.get(2);
	driver.switchTo().window(lastWin);
	System.out.println(driver.getTitle());
	driver.quit();
}
}
