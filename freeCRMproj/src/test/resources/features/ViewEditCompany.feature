Feature: DeleteCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@vieweditCompany
Scenario: view or edit Company with all valid fields
When user clicks on a company module
Then user clicks on edit button and is able to edit 
