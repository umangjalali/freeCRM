Feature: FilterCompany


Background: 
Given User logins to the application
Then User enter the email as "jalaliumang01@gmail.com"
Then user enter the password  as "madsumang"
And user click on login button


@filterCompany
Scenario: filter Company with all valid fields
When user clicks on the company module
Then user clicks on showfilter button and is able to filter the company
#And user search the company with the filter criteria
#Then user is able to view the company