package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllURLs {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.get("https://www.google.com/");
     driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");    
     driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
     Thread.sleep(2000);
     List<WebElement> links =  driver.findElements(By.xpath("//a"));
     for( int i=0;i<links.size();i++)
     {
    	 System.out.println(links.get(i).getAttribute("href"));
     }
    
	}

}
