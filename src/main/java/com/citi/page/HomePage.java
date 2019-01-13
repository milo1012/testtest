package com.citi.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.citi.base.TestBase;

public  class HomePage extends TestBase {
	@FindBy(id = "activity_loaded")
	private WebElement dashboard;
	public HomePage() {
		super();
	}

	public String confirmationHeader() {
		return dashboard.getText();
	}

}
