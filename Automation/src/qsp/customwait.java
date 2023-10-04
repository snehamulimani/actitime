package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customwait {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://demo.actitime.com/login.do");
     driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.id("pwd")).sendKeys("manager");
     driver.findElement(By.id("loginButton")).click();
     int i=0;
     while(i<100)
     {
    	 try
    	 {
    		 driver.findElement(By.id("logoutLink")).click();
    		 break;
    	 }
    	 catch(NoSuchElementException n) {
    		 i++;
    	 }
     }
	}

}
