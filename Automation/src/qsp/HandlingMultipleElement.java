package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/HP/Documents/demo.html");
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
int count=allLinks.size();
System.out.println(count);
WebElement link = allLinks.get(0);
String text = link.getText();
System.out.println(text);
	}

}
