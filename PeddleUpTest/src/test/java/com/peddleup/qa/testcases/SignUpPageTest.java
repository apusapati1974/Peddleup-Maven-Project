package com.peddleup.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.peddleup.qa.base.TestBase;
import com.peddleup.qa.pages.ClientLoginPage;
import com.peddleup.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase{
	
	SignUpPage signupPage;
	ClientLoginPage loginPage;
	
	public SignUpPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		signupPage = new SignUpPage();
	}
	
	@Test(priority=1)
	public void PageTitleTest() {
		String title = signupPage.validatePageTitle();
		Assert.assertEquals(title, "PeddleUp");
	}
	
	@Test(priority=2)
	public void singup() throws InterruptedException {
		loginPage = signupPage.signup(prop.getProperty("FullName"), prop.getProperty("Email"), prop.getProperty("MobileNumber"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword"));
		
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
