package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.LoginPage;
public class BaseClass {  
	//FileLib f=new FileLib();
	//EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterTest
     public void closeBrowser() {
    	 Reporter.log("closeBrowser",true);
    	 driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url=f.getPropertyData("url");
		String un=f.getPropertyData("username");
		String pw=f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.SetLogin(un, pw);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.SetLogout();
	}
}

