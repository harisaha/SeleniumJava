package week2.assignment;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedBus {
	String today;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/Selenium/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//String today = getCurrentDay();
		String today = Integer.toString(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		String retDate = "25";
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElementById("src").sendKeys("Chennai",Keys.TAB);
		driver.findElementById("dest").sendKeys("Trichy",Keys.TAB);
		driver.findElementByXPath("//label[text()='Onward Date']").click();
		Thread.sleep(2000);
		WebElement tab = driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tbody");
		Thread.sleep(1000);
		List<WebElement> data = tab.findElements(By.tagName("td"));
		System.out.println(data.size());
		for (WebElement eachDate : data) {
			if (eachDate.getText().equals(today)) {
				eachDate.click();
			}
		}	
		driver.findElementByXPath("//label[text()='Return Date']").click();
		WebElement retTab = driver.findElementByXPath("//div[@id='rb-calendar_return_cal']/table/tbody");
		List<WebElement> retRow = retTab.findElements(By.tagName("td"));
		for (WebElement eachDate : retRow) {
			if (eachDate.getText().equals(retDate)) {
				eachDate.click();

			}

		}
		driver.findElementById("search_btn").click();
		driver.findElementByXPath("//input[@id='atAfter 6 pm']/following-sibling::label").click();
		driver.findElementByXPath("//input[@id='bt_AC']/following-sibling::label").click();
		WebElement items = driver.findElementByXPath("//ul[@class='bus-items']");
		List<WebElement> bus = items.findElements(By.tagName("div"));
		for (int i = 0; i < bus.size(); i++) {

		}
		/*static String getCurrentDay() {
    //Create a Calendar Object
    Calendar cal = Calendar.getInstance();

    //Get Current Day as a number
    int todayInt = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Today Int: " + todayInt);
    String todayStr = Integer.toString(todayInt);
    System.out.println("Today Int: " + todayStr);
    return todayStr;


}*/
	}
}
