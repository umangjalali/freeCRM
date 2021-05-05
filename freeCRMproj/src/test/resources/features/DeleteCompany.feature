Feature: DeleteCompany


Background: 
Given User logins to the application
Then User enter the email
Then user enter the password
And user click on login button


@deleteCompany
Scenario: Delete Company with all valid fields
When user click on the company module
Then user clicks on the bin button and is able to delete the company

