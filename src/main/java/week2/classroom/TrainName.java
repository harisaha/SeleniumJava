package week2.classroom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainName {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	// To print train names
	/*driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
	driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
	driver.findElementById("chkSelectDateOnly").click();
	Thread.sleep(3000);
	WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	for (int i = 0; i < rows.size(); i++) {
		List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
		System.out.println(col.get(1).getText());
	}
	driver.close();*/
	driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
	driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
	driver.findElementById("chkSelectDateOnly").click();
	Thread.sleep(3000);
	WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	List<WebElement> row = table.findElements(By.tagName("tr"));
	List<WebElement> col = row.get(4).findElements(By.tagName("td"));
	for (int i = 0; i < col.size(); i++) {
		
	}
}
}
