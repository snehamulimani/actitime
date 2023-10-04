package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usageOfIsEnabled {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean res = driver.findElement(By.name("login")).isEnabled();
if(res)
{
	System.out.println("login button is enabled");
}
else
{
	System.out.println("login button is disabled");	
}



	}

}
