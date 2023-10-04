package com.actitime.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {

		@FindBy(id="logoutLink")
		private WebElement logout;
		
		@FindBy(xpath="//div[text()='Tasks']")
		private WebElement taskTab;
		
		@FindBy(xpath="//div[text()='Add New']")
		private WebElement addNewbtn;
		
		@FindBy(xpath="//div[@class='item createNewCustomer']")
		private WebElement newCustomerOption;
		
		@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
		private WebElement createCustomerName;
		
		@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
		private WebElement enterCustDescription;
		
		@FindBy(xpath="//div[text()='- Select Customer -'and @class='emptySelection']")
		private WebElement selectCustomerDD;
		
		@FindBy(xpath="//div[text()='Big Bang Company'and @class='itemRow cpItemRow ']")
		private WebElement bigBagCompany;
		
		@FindBy(xpath="//div[text()='Create Customer']")
		private WebElement createCustomerbtn;
		
		@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
		private WebElement actualCustomerName;
		
		@FindBy(xpath="//div[@class='item createNewProject']")
		private WebElement newProjectbtn;
		
		@FindBy(xpath="//input[@placeholder='Enter Project Name'and @class]")
		private WebElement projectNameTx;
		
		@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
		private WebElement selectCustomerDDProjectmod;
		
		@FindBy(xpath="(//div[text()='HDFC_001'and @class='itemRow cpItemRow ']")
		private WebElement addProjectFor;
		
		@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
		private WebElement projectDescriptionTx;
		
		@FindBy(xpath="//div[text()='Create Project']")
		private WebElement createProjectbtn;
		
		@FindBy(xpath="//div[@class='item createNewTasks']")
		private WebElement newTaskbtn;
		

		
		
		public EnterTimeTrackPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void SetLogout() {
			logout.click();
		}
		public void SetTaskTab() {
			taskTab.click();
		}
		public WebElement getLogout() {
			return logout;
		}
		public WebElement getTaskTab() {
			return taskTab;
		}
		public WebElement getAddNewbtn() {
			return addNewbtn;
		}
		public WebElement getNewCustomerOption() {
			return newCustomerOption;
		}
		public WebElement getCreateCustomerName() {
			return createCustomerName;
		}
		public WebElement getEnterCustDescription() {
			return enterCustDescription;
		}
		public WebElement getSelectCustomerDD() {
			return selectCustomerDD;
		}
		public WebElement getBigBagCompany() {
			return bigBagCompany;
		}
		public WebElement getCreateCustomerbtn() {
			return createCustomerbtn;
		}
		public WebElement getActualCustomerName() {
			return actualCustomerName;
		}
		public WebElement getNewProjectbtn() {
			return newProjectbtn;
		}
		public WebElement getProjectNameTx() {
			return projectNameTx;
		}
		public WebElement getSelectCustomerDDProjectmod() {
			return selectCustomerDDProjectmod;
		}
		public WebElement getAddProjectFor() {
			return addProjectFor;
		}
		public WebElement getProjectDescriptionTx() {
			return projectDescriptionTx;
		}
		public WebElement getCreateProjectbtn() {
			return createProjectbtn;
		}
		public WebElement getNewTaskbtn() {
			return newTaskbtn;
		}
		}
		
		

