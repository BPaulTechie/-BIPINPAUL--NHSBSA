package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseTest;

public class FinalResultPage extends BaseTest {
	private static By FINALRESULT= By.cssSelector("#result-heading");
	
	public void youGetHelpNHS () {
		String actual=driver.findElement(FINALRESULT).getText();
		Assert.assertTrue(actual.contains("Based on what you've told us"));
	
}
}