package com.stepDefinitions;

import com.pages.LiveWithPartnerPage;

import cucumber.api.java.en.When;

public class LiveWithPartnerStepDef {
	LiveWithPartnerPage partnerDetails=new LiveWithPartnerPage();
	
	@When("^I select my partnership status$")
	public void i_select_my_partnership_status() throws Throwable {
		partnerDetails.noPartner();

	}

}
