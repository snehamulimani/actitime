package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aleartPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(10);
		Alert a=driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(10);
		boolean result = driver.findElement(By.id("demo")).isDisplayed();
		if(result) {
			System.out.println("you pressed cancel");	  
		}
		else
			System.out.println("not displayed");;
	}

}
