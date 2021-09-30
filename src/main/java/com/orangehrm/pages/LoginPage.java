package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.orangehrm.*;
import com.orangehrm.utilities.ElementUtil;

import com.orangehrm.utilities.Constants;



public class LoginPage {

	private WebDriver driver;
	private ElementUtil elementUtil;

	// private By locators:
	private By username = By.id("txtUsername");
	private By password = By.id("txtPassword");
	private By loginBtn = By.id("btnLogin");
	private By forgotPwdLink = By.xpath("//div[@id='forgotPasswordLink']/a[text()='Forgotten Password']");
	private By header = By.id("logInPanelHeading");
	//private By registerLink = By.linkText("Register");

	// constructor:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	public String getLoginPageTitle() {
		return elementUtil.waitForTitleIs(Constants.LOGIN_PAGE_TITLE, 5);
	}

	
	public String getPageHeaderText() {
		return elementUtil.doGetText(header);
	}

	
	public boolean isForgotPwdLinkExist() {
		return elementUtil.doIsDisplayed(forgotPwdLink);
	}

	
	public void doLogin(String un, String pwd) {
		elementUtil.doSendKeys(username, un);
		elementUtil.doSendKeys(password, pwd);
		elementUtil.doClick(loginBtn);
		
	}
	public void orangehrmLogin(String un, String pwd) {
		
		elementUtil.doSendKeys(username, un);
 		elementUtil.doSendKeys(password, pwd);
    	elementUtil.doClick(loginBtn);
	}
	
	
	
	
}
