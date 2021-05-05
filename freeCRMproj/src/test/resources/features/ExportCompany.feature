Feature: ExportCompany


Background: 
Given User logins to the application
Then User enter the email
Then user enter the password
And user click on login button


@exportCompany
Scenario: Export Company with all valid fields
When user clicks on company module
Then user clicks on the export button and is able to export the company





