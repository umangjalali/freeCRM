Feature: RecoverCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@recoverCompany
Scenario: Recover Company with all valid fields
When user click on a company module
Then user clicks on trash button and recovers the company record
#Then user clicks on the company module button
#And user selects the particular company to be recovered
#Then user clicks on the restore button