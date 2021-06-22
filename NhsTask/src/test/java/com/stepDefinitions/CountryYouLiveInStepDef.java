package com.stepDefinitions;

import com.pages.CountryYouLiveInPage;

import cucumber.api.java.en.When;

public class CountryYouLiveInStepDef {
	
	CountryYouLiveInPage myCountry=new CountryYouLiveInPage();
	
			
	@When("^I select Wales as my country$")
	public void i_select_Wales_as_my_country() throws Throwable {
	myCountry.walesCustomer();
	}

}
