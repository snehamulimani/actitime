package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeOnlyParentWindow {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		    driver.findElement(By.id("apple-signin-button")).click();
		    driver.findElement(By.id("login-facebook-button")).click();
		   // String pwh = driver.getWindowHandle();
		  // Set<String> allwh = driver.getWindowHandles();
		   driver.close();
	}

}
