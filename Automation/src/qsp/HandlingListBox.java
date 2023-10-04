package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("Create new account")).click();
     Thread.sleep(3000);
     WebElement mon = driver.findElement(By.id("month"));
     Select s=new Select(mon);
     s.selectByIndex(10);
     Thread.sleep(3000);
     s.selectByValue("1");
     Thread.sleep(4000);
     s.selectByVisibleText("Apr");
     
	}

}
