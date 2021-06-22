package com.stepDefinitions;

import com.pages.ClaimBenefitsPage;

import cucumber.api.java.en.When;

public class ClaimBenefitStepDef {
	ClaimBenefitsPage benefitDetails=new ClaimBenefitsPage();
	
	@When("^I select my benefits or tax credits$")
	public void i_select_my_benefits_or_tax_credits() throws Throwable {
		benefitDetails.noBenefit();
	}

}
