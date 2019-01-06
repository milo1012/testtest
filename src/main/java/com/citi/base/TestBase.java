package com.citi.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		prop = new Properties();
		
			FileInputStream jahan;
			
try {
	jahan = new FileInputStream("C:\\Users\\sharm\\eclipse-workspace\\com.citi\\src\\main\\java\\com\\citi\\config\\config.properties");
				
	prop.load(jahan);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
			
	}


public static  void initialization() {
	  
	  String browsername = prop.getProperty("browser");
	  //String browsername = prop.getProperty("browser");
	  
	  if(browsername.equals("chrome")) {
		  System.setProperty("webdriver.chrome.driver","\\C:\\Users\\jahan\\OneDrive\\Desktop\\Driver\\chromedriver.exe\\");
		driver = new ChromeDriver();
	  }
	  else if(browsername.equals("FF")){
		  System.setProperty("webdriver.gecko.driver","\\C:\\Users\\jahan\\OneDrive\\Desktop\\Driver\\chromedriver.exe\\");
		driver = new FirefoxDriver();
	  

}
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  
	  driver.get(prop.getProperty("url"));
	  
}
}
