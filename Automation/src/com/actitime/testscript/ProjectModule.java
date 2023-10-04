package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class ProjectModule extends BaseClass {
	@Test
	public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("createProject",true);
		FileLib f =new FileLib();
		String projectName = f.getExcelData("Create Customer", 2, 4);
		String projectDescription = f.getExcelData("Create Customer", 2, 5);
		EnterTimeTrackPage e =new EnterTimeTrackPage(driver);
		e.SetTaskTab();
		Thread.sleep(3000);
		TaskList t=new TaskList(driver);
		t.getAddNewbtn().click();
		t.getNewProjectbtn().click();
		t.getProjectNameTx().sendKeys(projectName);
		t.getSelectCustomerDDProjectmod().click();
		t.getAddProjectFor().click();
		Thread.sleep(3000);
		t.getProjectDescriptionTx().sendKeys(projectDescription);
		Thread.sleep(3000);
		t.getCreateProjectbtn().click();
		Thread.sleep(3000);
		String actualtx = t.getCreatedProjectTitle().getText();
		Assert.assertEquals(projectName, actualtx);
	}
}
