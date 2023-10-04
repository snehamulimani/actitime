package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionswithoutDuplicate {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/hotel.html");
		WebElement mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			String text= alloptions.get(i).getText();
			set.add(text);
		}
		for(String string:set)
		{
			System.out.println(string);
		}
		driver.quit();

	}

}
