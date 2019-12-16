package week4.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFrame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	Alert alert = driver.switchTo().alert();
	alert.sendKeys("Hari");
	alert.accept();
	String text = driver.findElementById("demo").getText();
	if (text.contains("Hari")) {
		System.out.println("yes.. it contained.");
	}else {
		System.out.println("Contains incorrect value");
	}
	
	
	
	
}
}
