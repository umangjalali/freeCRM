Feature: ExportCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@exportCompany
Scenario: Export Company with all valid fields
When user click on company module
And user clicks on particular company to be exported
Then user is able to export the company details



@exportCompany
Scenario: Export Company with all invalid fields
When user click on company module
And user clicks on particular company to be exported
Then user is able to export the company details
And user verifies that the record is not downloaded
