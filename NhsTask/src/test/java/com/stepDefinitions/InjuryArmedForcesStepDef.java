package com.stepDefinitions;

import com.pages.InjuryArmedForcesPage;

import cucumber.api.java.en.When;

public class InjuryArmedForcesStepDef {
	InjuryArmedForcesPage armedForceDetails=new InjuryArmedForcesPage();
	
	@When("^I select armed force details$")
	public void i_select_armed_force_details() throws Throwable {
		armedForceDetails.noInjury();
		
	}

}
