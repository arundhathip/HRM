package com.orangehrm.pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.utilities.Constants;
import com.orangehrm.utilities.ElementUtil;
import com.orangehrm.utilities.JavaScriptUtil;

public class SeleniumEasyHomepage {
	
	private WebDriver driver;
	private ElementUtil elementUtil;
	private JavaScriptUtil jsUtil;
	
	private By alertsAndModalsLink=By.xpath("//a[text()='Alerts & Modals']");
	private By table=By.xpath("//a[text()='Table']");
	private By tablePagination=By.xpath("(//a[text()='Table Pagination'])[2]");
	private By tableHeadings= By.xpath("//table[@class='table table-hover']//th");
	private By tableRows=By.xpath("//tbody[@id='myTable']//tr");
	private By NothanksPopUp= By.xpath("//div[@id='at-cv-lightbox-button-holder']/a[2]");
	
	
	
	public SeleniumEasyHomepage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}

	public String getSeleniumEasyPageTitle() {
		return elementUtil.waitForTitleIs(Constants.SELENIUMEASY_PAGE_TITLE,5);
	}
	
	public void handlePopUp() throws InterruptedException
	{
		if(elementUtil.isElementExist(NothanksPopUp))
		{
			System.out.println(elementUtil.isElementExist(NothanksPopUp));
			Thread.sleep(7000);
			 Actions actions=new Actions(driver); 
			// Point p=elementUtil.getElement(NothanksPopUp).getLocation();
			 actions.moveToElement(elementUtil.getElement(NothanksPopUp)).click().
			 perform();
			 
			
			//jsUtil.clickElementByJS(elementUtil.getElement(NothanksPopUp));
		}
	}
	
	public void getTableDataOfEachPage()
	{
		elementUtil.doClick(table);
		elementUtil.doClick(tablePagination);
		List<WebElement> tablesHeads= elementUtil.getElements(tableHeadings);
		for(int i=0;i<tablesHeads.size();i++)
		{
			System.out.print(tablesHeads.get(i).getText()+"      ");
		}
		System.out.println();
		List<WebElement> tableRowsData= elementUtil.getElements(tableRows);
		
		
		for(int i=0;i<tableRowsData.size();i++)
		{
			
			System.out.print(tableRowsData.get(i).getText());
			System.out.println();
				
		}
		
		
	}
	
	public void getEachRowData(int row)
	{
		
		elementUtil.doClick(table);
		elementUtil.doClick(tablePagination);
		List<WebElement> tablesHeads= elementUtil.getElements(tableHeadings);
		for(int i=0;i<tablesHeads.size();i++)
		{
			System.out.print(tablesHeads.get(i).getText()+"      ");
		}
		System.out.println();
		
		List<WebElement> tableRowsData= elementUtil.getElements(tableRows);
		for(int i=1;i<=tableRowsData.size();i++)
		{
			
			System.out.print(tableRowsData.get(row).getText()+"      ");
		
				
		}
		
		
		
	}
	
	
	
	
}

