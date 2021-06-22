package com.pages;

import org.openqa.selenium.By;

import com.runner.BaseTest;

public class DateOfBirthPage extends BaseTest {
	private static By DOBDAY= By.cssSelector("#dob-day");
	private static By DOBMONTH= By.cssSelector("#dob-month");
	private static By DOBYEAR= By.cssSelector("#dob-year");
	private static By WHYWEASKDOB= By.cssSelector("summary[role='button']");
	private static By NEXTBUTTON= By.cssSelector("#next-button");
	
	public void enterValidDateOfBirth () {
	
		driver.findElement(DOBDAY).sendKeys("31");
	    driver.findElement(DOBMONTH).sendKeys("08");
	    driver.findElement(DOBYEAR).sendKeys("1950");
	    driver.findElement(WHYWEASKDOB).click();
	    driver.findElement(NEXTBUTTON).click();

}
}