package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.automationtesting.in/Alerts.html");
    driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
    driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
    Thread.sleep(10);
    Alert a=driver.switchTo().alert();
    String text=a.getText();
    a.accept();
    Thread.sleep(10);
  boolean res= driver.findElement(By.xpath("//button[@class='btn btn-info']")).isDisplayed();
  if(res)
	  System.out.println("Hello Automation Testing user How are you today");
  else
	  System.out.println("is not displayed");
    Thread.sleep(10);
    driver.quit();
	}

}
