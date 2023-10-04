package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelectListBox {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/HP/Documents/hotel.html");
   WebElement mtrlist = driver.findElement(By.id("mtr"));
   Select s=new Select(mtrlist);
   s.selectByIndex(0);
   s.selectByValue("v");
   s.selectByVisibleText("dosa");
   s.deselectByIndex(2);
   s.deselectByValue("d");
   s.deselectByVisibleText("idaly");
   System.out.println(s.isMultiple());
   
	}

}
