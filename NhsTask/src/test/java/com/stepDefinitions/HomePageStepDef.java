package com.stepDefinitions;

import com.pages.HomePage;

import cucumber.api.java.en.Given;

public class HomePageStepDef {
	
	HomePage homePage=new HomePage();
	
	@Given("^I am in check for help paying page$")
	public void i_am_in_check_for_help_paying_page() throws Throwable {
		homePage.verifyHomePage();
		}
}
