package com.orangehrm.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.orangehrm.pages.*;
import com.orangehrm.factory.DriverFactory;
import com.orangehrm.pages.LoginPage;

public class BaseTest {

	
	WebDriver driver;
	Properties prop;
	
	

	LoginPage loginPage;
	DashBoardPage dashboardPage;
	DriverFactory df;
	
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.initProperties();
		driver = df.initDriver(prop);
		loginPage = new LoginPage(driver);
	
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
