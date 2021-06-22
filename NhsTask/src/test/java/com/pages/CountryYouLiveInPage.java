package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseTest;

public class CountryYouLiveInPage extends BaseTest{
	private static By LABELWALES= By.cssSelector("#label-wales");
	private static By NEXTBUTTON= By.cssSelector("#next-button");
	
	public void walesCustomer () {
	
    driver.findElement(LABELWALES).click();
    driver.findElement(NEXTBUTTON).click();
}
}