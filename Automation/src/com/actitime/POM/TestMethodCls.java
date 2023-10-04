package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethodCls {
	
	@Test
	public void validLogin() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.SetLogin("admin1","manager1");
		//l.SetLogin("admin6","manager28");
		//l.SetLogin("admin18","manager24");
		l.SetLogin("admin","manager");
	}
}
