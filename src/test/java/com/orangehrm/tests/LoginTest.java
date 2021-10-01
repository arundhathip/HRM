package com.orangehrm.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.orangehrm.utilities.Constants;
import com.orangehrm.utilities.Errors;
import com.orangehrm.utilities.ExcelUtil;
import com.orangehrm.pages.*;



public class LoginTest extends BaseTest {
	private static String TEST_DATA_SHEET = "D:\\Aruna\\Source\\OrangeHrm\\src\\test\\resources\\testdata\\OrangeHRMTestData.xlsx";
	private static Workbook book;
	private static Sheet sheet;
	
	
//	@Test(priority = 1)
//	public void loginPageTitleTest() {
//		String title = loginPage.getLoginPageTitle();
//		System.out.println("lp title is: " + title);
//		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE, Errors.TITLE_ERROR_MESSG);
//	}

	
	@Test(priority = 1)
	public void loginPageHeaderTest() {
		String header = loginPage.getPageHeaderText();
		System.out.println("lp header is: " + header);
		Assert.assertEquals(header, Constants.LOGIN_PAGE_HEADER, Errors.HEADER_ERROR_MESSG);
	}

	
	

	
	@Test(priority = 3)
	public void loginTest() {
		 loginPage.doLogin(prop.getProperty("username").trim(),
		prop.getProperty("password").trim());
	}
	
		@Test
			public void loginPage_WarnMessageTest(String un, String pwd) {
//     			if(doLogin(un,pwd)) {
//					String ErrorMsg = driver.findElement(By.id("spanMessage")).getText();
//					Assert.assertEquals(ErrorMsg,"Invalid Credentials","Please enter valid Credentials");
//				}
			}

			public boolean doLogin(String un, String pwd) {
				loginPage.doLogin(un,pwd);
				return driver.findElement(By.id("spanMessage")).isDisplayed();
			}
			
	}


