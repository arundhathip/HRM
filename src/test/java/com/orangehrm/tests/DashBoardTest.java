package com.orangehrm.tests;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.utilities.Constants;



public class DashBoardTest extends BaseTest{
	
	public void dashboardPageSetup() {
		dashboardPage = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	
//	@Test(priority = 1)
//	public void dashboardPageTitleTest() {
//		String title = dashboardPage.getDashBoardPageTitle();
//		System.out.println("dashboard page title is: " + title);
//		Assert.assertEquals(title, Constants.DASHBOARD_PAGE_TITLE);
//	}

	
	@Test(priority = 2)
	public void dashboardPageHeaderTest() {
		String header = dashboardPage.getDashBoardPageHeader();
		System.out.println("dashboard page header is: " + header);
		Assert.assertEquals(header, Constants.DASHBOARD_PAGE_HEADER);
	}
	@Test(priority = 3)
	public void dashboardPageUrlTest() {
		String url = dashboardPage.getDashBoardpageUrl();
		System.out.println("adashboard page url is: " + url);
		Assert.assertEquals(url, Constants.DASHBOARD_PAGE_URL_FRACTION);
	}
	
	}
