package com.peddleup.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peddleup.qa.base.TestBase;
import com.peddleup.qa.pages.ClientLoginPage;
import com.peddleup.qa.pages.ClientManageProfilePage;

public class ClientLoginPageTest extends TestBase{
	
	ClientLoginPage loginPage;
	// calling the reference variable
	ClientManageProfilePage clientProfile;
	
	// Create the constructor for ClientLoginPageTest
	public ClientLoginPageTest() {
		/*
		 * super keyword will call the super class constructor, which means 
		 * calling TestBase class constructor.
		 */
		super();

	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		//create the object of LoginPage class
		// LoginPage class i can access all methods 
		loginPage = new ClientLoginPage();
	}

	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Peddleup Login");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}



}
