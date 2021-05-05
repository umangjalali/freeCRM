Feature: FilterCompany


Background: 
Given User logins to the application
Then User enter the email
Then user enter the password
And user click on login button


@filterCompany
Scenario: filter Company with all valid fields
When user clicks on the company module
Then user clicks on showfilter button and is able to filter the company
#And user search the company with the filter criteria
#Then user is able to view the company