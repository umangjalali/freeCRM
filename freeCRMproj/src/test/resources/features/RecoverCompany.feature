Feature: RecoverCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@recoverCompany
Scenario: Recover Company with all valid fields
When user click on company module
And user clicks on delete button
Then user clicks on the company module button
And user selects the particular company to be recovered
Then user clicks on the restore button 
