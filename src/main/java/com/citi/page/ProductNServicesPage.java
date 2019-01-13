package com.citi.page;

import com.citi.base.TestBase;


	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;



	public class ProductNServicesPage extends TestBase {

		@FindBy(xpath = "//span[text()= 'Products & Services']")
		WebElement ProductsServices;

		@FindBy(xpath = "//a[text()= 'New Service']")
		WebElement NewService;

		@FindBy(xpath = "//input[@id=\"name\"]")
		WebElement TypeName;

		@FindBy(xpath = "//input[@id=\"sales_price\"]")
		WebElement salesprice;

		@FindBy(xpath = "//input[@id=\"item_number\"]")
		WebElement Itemnumber;

		@FindBy(xpath = "//textarea[@class=\"form-control\"]")
		WebElement Description;

		@FindBy(xpath = "//button[@class=\"btn btn-sm btn-primary\"]")
		WebElement ClickSubmit;

		public ProductNServicesPage() {
			PageFactory.initElements(driver, this);

		}

		public void newService(String name, String saleprice, String itemnumber, String description) throws Exception {

			ProductsServices.click();
			Thread.sleep(4000);
			NewService.click();
			Thread.sleep(4000);
			TypeName.sendKeys(name);
			Thread.sleep(2000);
			salesprice.sendKeys(saleprice);
			Itemnumber.clear();// Use Clear Method - It will clear the field first then enter Itemnumber
			Itemnumber.sendKeys(itemnumber);
			Description.sendKeys(description);
			Thread.sleep(3000);
			ClickSubmit.click();

		}
	}


