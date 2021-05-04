Feature: DeleteCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@deleteCompany
Scenario: Delete Company with all valid fields
When user click on the company module
Then user clicks on the bin button and is able to delete the company

