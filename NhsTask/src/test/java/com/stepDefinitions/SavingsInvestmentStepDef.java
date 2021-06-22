package com.stepDefinitions;

import com.pages.SavingsInvestmentsPage;

import cucumber.api.java.en.When;

public class SavingsInvestmentStepDef {
	SavingsInvestmentsPage savingsDetails=new SavingsInvestmentsPage();
	

	@When("^I select my savings and investments$")
	public void i_select_my_savings_and_investments() throws Throwable {
		savingsDetails.noSavings();
		
		
	}
}
