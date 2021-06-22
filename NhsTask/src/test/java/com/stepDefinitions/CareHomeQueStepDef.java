package com.stepDefinitions;

import com.pages.CareHomeQuePage;

import cucumber.api.java.en.When;

public class CareHomeQueStepDef {
	CareHomeQuePage careHomeDetails=new CareHomeQuePage ();
	

	@When("^I select care home details$")
	public void i_select_care_home_details() throws Throwable {
		careHomeDetails.noCareHome();
	

}
}