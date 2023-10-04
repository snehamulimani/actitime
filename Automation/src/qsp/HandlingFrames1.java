package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/page1.html");
		WebElement T1 = driver.findElement(By.id("t1"));
		T1.sendKeys("a");
		driver.switchTo().frame(0);
		WebElement T2 = driver.findElement(By.id("t2"));
		T2.sendKeys("b");
		driver.switchTo().parentFrame();
		T1.sendKeys("c");
		driver.switchTo().frame(0);
		T2.sendKeys("d");
	}

}
