package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor )driver;
j.executeScript("window.scrollTo(0,3000)");
}
}