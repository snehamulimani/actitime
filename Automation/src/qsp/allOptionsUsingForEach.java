package qsp;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class allOptionsUsingForEach {

	public static void main(String[] args) {

		    WebDriver driver=new ChromeDriver();
		    driver.get("file:///C:/Users/HP/Documents/hotel.html");
		   WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		   Select s=new Select(mtrlistbox);
		  List<WebElement> alloptions = s.getOptions();
		  for(WebElement e:alloptions)
		  {
			 String text= e.getText();
			 System.out.println(text);
		  }
		  driver.quit();
		   
			}

		}

