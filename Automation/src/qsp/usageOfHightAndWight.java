package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageOfHightAndWight {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
WebElement user = driver.findElement(By.name("username"));
int height = user.getSize().getHeight();
int width = user.getSize().getWidth();
System.out.println("Heigth="+height);
System.out.println("Width="+width);
WebDriver driver1=new ChromeDriver();
WebElement user1 = driver1.findElement(By.name("pwd"));
int height1 = user1.getSize().getHeight();
int width1 = user1.getSize().getWidth();
System.out.println("Heigth="+height1);
System.out.println("Width="+width1);
//driver.quit();

	}

}
