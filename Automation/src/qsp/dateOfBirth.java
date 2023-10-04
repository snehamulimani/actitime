package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dateOfBirth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.facebook.com/");
     driver.findElement(By.linkText("Create new account")).click();
     WebElement date = driver.findElement(By.id("day"));
     Select s=new Select(date);
    WebElement mon = driver.findElement(By.id("month"));
    Select s1=new Select(mon);
    WebElement year=driver.findElement(By.id("year"));
    Select s2=new Select(year);
    s2.selectByVisibleText("1998");
    s.selectByValue("25");
    s1.selectByIndex(1);
       
	}

}
