package com.peddleup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peddleup.qa.base.TestBase;

public class ClientLoginPage extends TestBase{

	// First we have to define PageFactory / Object Repository
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-white-outline display-4')]")
	WebElement loginbutton;

	@FindBy(name = "email_id")
	WebElement email_id;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//label[contains(text(),'Agency')]")
	WebElement Agency;

	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	WebElement loginbtn;

	/*
	 *	Creating constructor of base class
	 *	driver is came from the base class TestBase.java, 
	 *	this means pointing to current class objects.
	 *	This is initializing the Page Objects
	 */ 

	public ClientLoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Validating the page title 
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}


	public ClientManageProfilePage login(String email,String pwd) throws InterruptedException {
		loginbutton.click();
		email_id.sendKeys(email);
		Thread.sleep(2000);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		Agency.click();
		Thread.sleep(2000);
		loginbtn.click();

		// should return ManageProfilePage Oject.
		return new ClientManageProfilePage();
	}

}
