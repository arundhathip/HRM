package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.pages.*;
import com.orangehrm.utilities.*;



public class DashBoardPage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	private By leaveList  =By.xpath("//div[@class='quickLaunge']/a");
	private By header = By.xpath("//div[@class='head']/h1");

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	public String getDashBoardPageTitle() {
		return elementUtil.waitForTitleIs(Constants.DASHBOARD_PAGE_TITLE,5);
	}
	
	
	public String getDashBoardpageUrl() {
		return elementUtil.waitForUrlContains(Constants.DASHBOARD_PAGE_URL_FRACTION, 5);
	}
	
	
	public String getDashBoardPageHeader() {
		return elementUtil.doGetText(header);
	}
	
}
