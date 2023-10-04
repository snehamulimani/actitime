package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.POM.EnterTimeTrackPage;
import com.actitime.POM.TaskList;
import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
@Listeners(com.actitime.generic.ListenerImplimentation.class)
public class TaskModule extends BaseClass {
	@Test
	public void testCreateTask() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("createCustomer",true);
		FileLib f =new FileLib();
		String taskName = f.getExcelData("Create Customer", 3, 6);
		EnterTimeTrackPage e =new EnterTimeTrackPage(driver);
		e.SetTaskTab();
		TaskList t=new TaskList(driver);
		t.getAddNewbtn().click();
		t.getNewTaskbtn().click();
		t.getSelectCustomerPresent().click();
		t.getSelectCustomerFor().click();
		t.getSelectProjectPresent().click();
		t.getSelectProjectFor().click();
		t.getEnterTaskName().sendKeys(taskName);
		Thread.sleep(5000);
		t.getCreateTaskbtn().click();
		
}
}