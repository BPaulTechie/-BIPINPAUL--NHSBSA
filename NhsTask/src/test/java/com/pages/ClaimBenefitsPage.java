package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseTest;

public class ClaimBenefitsPage extends BaseTest {
	private static By LABELNO= By.cssSelector("#label-no");
	private static By NEXTBUTTON= By.cssSelector("#next-button");
	
	public void noBenefit () {
	    driver.findElement(LABELNO).click();
	    driver.findElement(NEXTBUTTON).click();
	}

}
