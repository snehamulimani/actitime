package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(2000);
	List<WebElement> allsugn = driver.findElements(By.xpath("//span[text()='java']"));
	int count=allsugn.size();
	System.out.println(count);
	for(int i=0;i<count;i++)
	{
	String text = allsugn.get(i).getText();
	System.out.println(text);
		
	}
	allsugn.get(0)	.click();
		

	}

}
