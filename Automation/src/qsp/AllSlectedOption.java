package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSlectedOption {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/HP/Documents/hotel.html");
     WebElement slvlistbox = driver.findElement(By.id("slv"));
     Select s=new Select(slvlistbox);
     List<WebElement> allsoptions = s.getAllSelectedOptions();
     int count=allsoptions.size();
     System.out.println(count);
     for(int i=0;i<count;i++)
     {
    	 String text=allsoptions.get(i).getText();
    	 System.out.println(text);
     }
     driver.quit();
	}

}
