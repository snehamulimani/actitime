package com.actitime.testscript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("createCustomer",true);
		FileLib f =new FileLib();
		String customerName = f.getExcelData("Create Customer", 1, 2);
		String discription = f.getExcelData("Create Customer", 1, 3);
		EnterTimeTrackPage e =new EnterTimeTrackPage(driver);
		e.SetTaskTab();
		e.getAddNewbtn().click();
		e.getNewCustomerOption().click();
		e.getCreateCustomerName().sendKeys(customerName);
		e.getEnterCustDescription().sendKeys(discription);
		e.getSelectCustomerDD().click();
		e.getBigBagCompany().click();
		Thread.sleep(3000);
		e.getCreateCustomerbtn().click();
		Thread.sleep(3000);
		 String actualCustomerText=e.getActualCustomerName().getText();
		Assert.assertEquals(actualCustomerText, customerName);
		
	}
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createProject",true);
		FileLib f =new FileLib();
		String projectName = f.getExcelData("Create Customer", 2, 4);
		String projectDescription = f.getExcelData("Create Customer", 2, 5);
		EnterTimeTrackPage e =new EnterTimeTrackPage(driver);
		e.SetTaskTab();
		Thread.sleep(3000);
		e.getAddNewbtn().click();
		e.getNewProjectbtn().click();
		e.getProjectNameTx().sendKeys(projectName);
		e.getSelectCustomerDDProjectmod().click();
		e.getAddProjectFor().click();
		Thread.sleep(3000);
		e.getProjectDescriptionTx().sendKeys(projectDescription);
		Thread.sleep(3000);
		e.getCreateProjectbtn().click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		//String actualtx = e.getCreatedProjectTitle.getText();
		//Assert.assertEquals(projectName, actualtx);
		
	}
	
}

