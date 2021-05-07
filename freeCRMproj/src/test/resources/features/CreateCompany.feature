Feature: CreateCompany


Background: 
Given User logins to the application
Then User enter the email 
Then user enter the password
And user click on login button


@createCompany
Scenario: Create Company with all valid fields
When user click on company module
And user clicks on create company
Then user enters the valid name
And user access the public button
Then user enters the url of the company website
And user enter the address of the company
Then user enters the phone number of the company
And user enter the tags associated to it
Then user enters the description of the company
And user selects the social channels linked to the company
Then user enters the industry associated with the company
And user enters the number of employees in the company
Then user enters the stock symbol of the company
And user enters the annual revenue of the company
Then user selects the priority of the company
And user selects the status of the company
Then user selects the source of the company
And user selects the category of the company
Then user enters the VAT number of the company
And user enters the identifier of the company
#Then user is able to upload the image
And user is able to create a company




@createCompany1
Scenario Outline: Create Company with all Invalid fields name
When user click on company module
And user clicks on create company
Then user enters the invalid <name>
Examples:

|name|
|Omkarenterpriseslimitededitiontextileqwertyuioplkjhgfdsazxcvbnm|
|Amazon@1234456_098765|
#Then user enters the invalid name as "Omkarenterpriseslimitededitiontextileqwertyuioplkjhgfdsazxcvbnm"
#Then user enters a invalid name as "Amazon@1234456_098765"

@createCompany2
Scenario Outline: Create Company with all Invalid fields zip
When user click on company module
And user clicks on create company
Then user write the invalid address of the company where <zip>
Examples:

|zip|
|20100|
|2010050|
#And user enter the invalid address of the company where zip as "20100"
#And user enter the invalid address of the company where zip as "2010050"

@createCompany3
Scenario Outline: Create Company with all Invalid fields phone
When user click on company module
And user clicks on create company
Then user enter the invalid <phonenumber>
Examples:

|phonenumber|
|987654|
|9234523451098181|
#Then user enters the invalid phone number of the company as "987654"
#Then user enters the invalid phone number of the company as "9234523451098181"

@createCompany4
Scenario Outline: Create Company with all Invalid fields employee
When user click on company module
And user clicks on create company
Then enters the invalid number <employees>
Examples:

|employees|
|qazswxedcf|
|-100|
#And user enters the invalid number of employees as "qwertyuiop"
#And user enters the invalid number of employees as "-100"



