package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseTest;

public class SavingsInvestmentsPage extends BaseTest {
	private static By LABELNO= By.cssSelector("#label-no");
	private static By NEXTBUTTON= By.cssSelector("#next-button");
	
	public void noSavings () {
		
	    driver.findElement(LABELNO).click();
	    driver.findElement(NEXTBUTTON).click();

}
}