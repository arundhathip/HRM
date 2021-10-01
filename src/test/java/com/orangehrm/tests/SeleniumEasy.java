package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumEasy {
	
//	SeleniumEasy(WebDriver driver){
//		this.driver= driver;
//	


       
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(null);
	}
	
	@Test
	public void printMsg1() {
		System.out.println("Hello");
		System.out.println("World");
		
	}
	@Test
	public void printMsg2() {
		System.out.println("Hai");
	}
	@Test
	public void printMsg3() {
		//driver.findElement(By.xpath("//div[@id=\"site-slogan\"]/h2")).getText();
	}
}
