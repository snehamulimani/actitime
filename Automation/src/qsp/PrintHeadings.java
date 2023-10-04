package qsp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeadings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();	
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Thread.sleep(2000);
		Set<String> allwid = driver.getWindowHandles();
		System.out.println(allwid.size());
		for(String wid:allwid) {
			driver.switchTo().window(wid);
		}
		Thread.sleep(3000);
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		for(int i=1;i<headings.size();i++) {
			String text = headings.get(i).getText();
		System.out.println(text);
		}
	}

}
