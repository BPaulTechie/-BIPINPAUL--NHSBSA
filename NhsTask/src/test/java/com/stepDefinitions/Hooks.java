package com.stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseTest{
	private static By COOKIES= By.cssSelector("#nhsuk-cookie-banner__link_accept_analytics");
	
	@Before
	
	public void start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(COOKIES).click();
		JavascriptExecutor executer = (JavascriptExecutor) driver;
	    executer.executeScript("window.scrollBy(0,500)");
	    }
	

    @After
    public void close() {
    
    	driver.close();
    }

}