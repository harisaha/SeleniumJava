package week4.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReplaceClass {
public static void main(String[] args) throws InterruptedException {
	/*String a = "str 1235";
	a.replaceAll("//D", "");
	System.out.println(a.replaceAll("\\D", ""));*/
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/Test-Exclusive-606/dp/B07HGJK535/ref=sr_1_1?keywords=oneplus+7+pro+mobiles&qid=1576407686&smid=A23AODI1X2CEAE&sr=8-1");
	System.out.println("op1");
	
}
}
