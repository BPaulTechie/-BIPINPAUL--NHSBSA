package com.stepDefinitions;

import com.pages.FinalResultPage;

import cucumber.api.java.en.Then;

public class FinalResultPageStepDef {
	FinalResultPage finalResult=new FinalResultPage();
	

	@Then("^I should see the relevant result$")
	public void i_should_see_the_relevant_result() throws Throwable {
		finalResult.youGetHelpNHS();
		

}
}