package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class print1SelectedOption {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/HP/Documents/hotel.html");
     WebElement slvlistbox = driver.findElement(By.id("slv"));
     Select s=new Select(slvlistbox);
    String fso = s.getFirstSelectedOption().getText();
    System.out.println(fso);
    driver.quit();
	}
}
