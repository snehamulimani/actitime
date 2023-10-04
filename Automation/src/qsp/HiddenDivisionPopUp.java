package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
    driver.findElement(By.id("policynumber")).sendKeys("123");
    driver.findElement(By.xpath("//input[@id='dob']")).click();
    WebElement month = driver.findElement(By.className("ui-datepicker-month"));
    Select s =new Select(month);
    s.selectByIndex(1);
   WebElement year = driver.findElement(By.className("ui-datepicker-year"));
   Thread.sleep(10);
    Select s1=new Select(year);
    s1.selectByValue("1998");
    Thread.sleep(10);
     driver.findElement(By.xpath("//a[@data-date='25']")).click();
     Thread.sleep(10);
    driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
    Thread.sleep(10);
   WebElement result = driver.findElement(By.id("renew_policy_submit"));
   result.click();
   Thread.sleep(10);
   boolean res = driver.findElement(By.id("renew_policy_submit")).isDisplayed();
   if(res)  
	   System.out.println("please enter valid policy number");   
   else
	   System.out.println("is not displayed");   
	}
	 
}
