package com.citi.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.citi.base.TestBase;

public class LoginPage extends TestBase {
	
	// find all locators
		@FindBy(id = "username")
		WebElement un;
		@FindBy(id = "password")
		WebElement pw;
		@FindBy(name = "login")
		WebElement SignInBut;
		@FindBy(xpath = "//div[@ class = \"login-brand text-center\"]")
		WebElement TechFiosLogo;

	
	
	
	//PageFactory
	public LoginPage() {
		PageFactory.initElements(driver, this);//this means current class object
	}
	//All Action
public String VerifyTitleofLoginPage() {
	return driver.getTitle();
}
public boolean logo() {
	return TechFiosLogo.isDisplayed();
}
public HomePage login1(String username , String password) {
	un.clear();
	un.sendKeys(username);
	pw.clear();
	pw.sendKeys(password);
	SignInBut.click();
	return new HomePage();
}
	
}
