package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeOnlySpecificBrowser {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the title");
		String input=s.nextLine();
		 WebDriver driver=new ChromeDriver();
		    driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
		    driver.findElement(By.id("apple-signin-button")).click();
		    driver.findElement(By.id("login-facebook-button")).click();
		    String pwh = driver.getWindowHandle();
		   Set<String> allwh = driver.getWindowHandles();
		   for(String wh: allwh)
		   {
			   driver.switchTo().window(wh);
			   String title=driver.getTitle();
			   System.out.println(title + " " + wh);
				   
			   
				   driver.quit();
			   }
		   }
		   
	}



