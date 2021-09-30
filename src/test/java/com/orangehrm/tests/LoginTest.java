package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.orangehrm.utilities.Constants;
import com.orangehrm.utilities.Errors;
import com.orangehrm.pages.*;



public class LoginTest extends BaseTest {
	
	
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
	public void forgotPwdLinkTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}

	
	@Test(priority = 2)
	public void loginTest() {
		 loginPage.doLogin(prop.getProperty("username").trim(),
				prop.getProperty("password").trim());
		
	}


}