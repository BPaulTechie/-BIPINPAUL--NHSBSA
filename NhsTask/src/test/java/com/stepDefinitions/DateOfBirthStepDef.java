package com.stepDefinitions;

import com.pages.DateOfBirthPage;

import cucumber.api.java.en.When;

public class DateOfBirthStepDef {
	DateOfBirthPage dOB=new DateOfBirthPage();
	
	@When("^I enter my date of birth$")
	public void i_enter_my_date_of_birth() throws Throwable {
	 dOB.enterValidDateOfBirth();
	}

}
