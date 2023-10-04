package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollbarUsingActionClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		Actions a=new Actions(driver);
		//JavascriptExecutor j=(JavascriptExecutor )driver;
		//j.executeScript("window.scrollTo(0,3000)");
		a.scrollByAmount(0, 3000).perform();
		}
}
