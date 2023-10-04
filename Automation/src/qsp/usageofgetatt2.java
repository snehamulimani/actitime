package qsp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class usageofgetatt2 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 WebElement link = driver.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));
	 String value=link.getAttribute("src");
	 String tag=link.getTagName();
	 System.out.println(value);
	 System.out.println(tag);
	 driver.quit();
		}

	}


