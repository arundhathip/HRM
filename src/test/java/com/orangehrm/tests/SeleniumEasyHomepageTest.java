package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.utilities.Constants;

public class SeleniumEasyHomepageTest extends BaseTest{
	
	@Test(priority = 0)
public void seleniumEasyPageTitleTest() {
String title = seleniumEasyHomepage.getSeleniumEasyPageTitle();
System.out.println("seleniumEasy Homepage  title is: " + title);
Assert.assertEquals(title, Constants.SELENIUMEASY_PAGE_TITLE);
}
	@Test(priority = 1)
	public void handlingpopup() throws InterruptedException
	{
		seleniumEasyHomepage.handlePopUp();
	}
	
	@Test(priority = 2)
	public void getTableDataTest()
	{
		seleniumEasyHomepage.getTableDataOfEachPage();
		
	}
	
	@Test(priority = 3)
	public void getREquiredRowData()
	{
		seleniumEasyHomepage.getEachRowData(4);
		
	}
	
	
	
	
	
	
}

