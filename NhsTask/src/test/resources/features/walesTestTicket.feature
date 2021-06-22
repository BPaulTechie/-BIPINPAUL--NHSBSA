Feature: walesTestTicket

Scenario: a person from Wales put details in checker tool

Given I am in check for help paying page
When I select Wales as my country
And I enter my date of birth
And I select my partnership status
And I select my benefits or tax credits
And I select armed force details
And I select care home details
And I select my savings and investments
Then I should see the relevant result