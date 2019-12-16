package week3.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// To print train names
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
		driver.findElementById("chkSelectDateOnly").click();
		Thread.sleep(3000);
		List<WebElement> trainName = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
		List<String> op = new ArrayList<>();
		System.out.println(trainName.size());
		for (WebElement eachTrain : trainName) {
			//System.out.println(eachTrain.getText());
			op.add(eachTrain.getText());


		}
		System.out.println(op);
		Collections.sort(op);
		System.out.println(op);
		int size = op.size();
		int count=0;
		for (int i = 0; i < op.size(); i++) {
			if(i<op.size()) {
			if (op.get(i).equals(op.get(i+1))) {
				count++;
			}
			
			if(count!=0) {
				System.out.println("Found a duplicates.");
			}else {
				System.out.println("Duplicate does not exist.");
			}
		}
			
		
		Thread.sleep(5000);
		List<WebElement> trainNo = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
		System.out.println(trainNo.size());
		Set<String> num = new TreeSet<>();
		for (WebElement eachNum : trainNo) {
			num.add(eachNum.getText());
		}
		System.out.println(num);
		if (trainNo.size()==num.size()) {
			System.out.println("No Duplicates.");
		}
		else {
			System.out.println("Found a duplicate in train number list.");
		}
		
		//List<WebElement> rows = table.findElements(By.tagName("tr"));
		//System.out.println(rows.size());

		driver.close();
		/*driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
	driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
	driver.findElementById("chkSelectDateOnly").click();
	Thread.sleep(3000);
	WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	List<WebElement> row = table.findElements(By.tagName("tr"));
	List<WebElement> col = row.get(1).findElements(By.tagName("td"));
	for (int i = 0; i < col.size(); i++) {

	}*/
	}
	}
}
