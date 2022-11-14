package com.peddleup.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.peddleup.qa.base.TestBase;

public class SignUpPage extends TestBase {
	
	@FindBy(xpath = "//a[contains(@class,'btn btn-white display-4')]")
	WebElement SignUpbtn;
	
	@FindBy(name = "user")
	WebElement FullName;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name = "mobile")
	WebElement MobileNnumber;
	
	@FindBy(name = "dateofbirth")
	WebElement DateofBirth;
	
	@FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[1]/td[3]")
	WebElement Calendar;
	
	@FindBy(xpath = "//label[contains(@for,'genderChoice1')]")
	WebElement Gender;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "confirm_password")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//label[contains(@for,'contactChoice1')]")
	WebElement Radiobtn;
	
	@FindBy(name = "terms")
	WebElement terms;
	
	@FindBy(xpath = "//button[contains(text(),'SIGN UP')]")
	WebElement SignUpbutton;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okbtn;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public ClientLoginPage signup(String Fname,String emailid,String mobnum, String pwd,String cpwd) throws InterruptedException {
		
		SignUpbtn.click();   // Home Page Signup Button
		FullName.sendKeys(Fname);
		Thread.sleep(2000);
		Email.sendKeys(emailid);
		Thread.sleep(2000);
		MobileNnumber.sendKeys(mobnum);
		Thread.sleep(2000);
		DateofBirth.click();
		Thread.sleep(2000);
		Calendar.click();
		Thread.sleep(2000);
		Gender.click();
		Thread.sleep(2000);
		Password.sendKeys(pwd);
		Thread.sleep(2000);
		ConfirmPassword.sendKeys(cpwd);
		Radiobtn.click();
		Thread.sleep(2000);
		terms.click();
		Thread.sleep(2000);
		SignUpbutton.click();
		Thread.sleep(2000);
		okbtn.click();
		
		return new ClientLoginPage();
		
	}
}
