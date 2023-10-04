package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPerticularEleUsingActionClass {
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bbc.com/");
			WebElement y = driver.findElement(By.xpath("//h2[text()='Mumbai Weather']"));
			//JavascriptExecutor j=(JavascriptExecutor )driver;
			//j.executeScript("window.scrollBy(0,"+y+")");
			Actions a =new Actions(driver);
			a.scrollToElement(y).perform();
			}
}
