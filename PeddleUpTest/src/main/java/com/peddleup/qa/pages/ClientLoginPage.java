package com.peddleup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.peddleup.qa.base.TestBase;

public class ClientLoginPage extends TestBase{
	
	// First we have to define PageFactory / Object Repository
	// First we have to define Object Repository / Page factory.
		@FindBy(name = "email_id")
		WebElement email_id;

}
