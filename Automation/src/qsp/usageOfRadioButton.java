package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageOfRadioButton {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("(//a[@role='button'])[2] ")).click();
     int y1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).getLocation().getY();
     int y2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
     int y3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]")).getLocation().getY();
     if(y1==y2 && y2==y3)
     {
    	 System.out.println("gender radio button is properly aligned and passed");
     }
     
     else
     {
    	 System.out.println("gender radio button is not properly aligned and failed"); 
     }
     driver.quit();
	}

}
