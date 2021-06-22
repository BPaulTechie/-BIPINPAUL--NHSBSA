package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseTest;

public class HomePage extends BaseTest {
	private static By STARTBUTTON= By.cssSelector(".button.button-get-started");
	
	public void verifyHomePage() {
		Assert.assertEquals("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
	    driver.findElement(STARTBUTTON).click();
		}

}
