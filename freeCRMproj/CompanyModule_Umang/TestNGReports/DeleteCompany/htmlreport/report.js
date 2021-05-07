$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/DeleteCompany.feature");
formatter.feature({
  "line": 1,
  "name": "DeleteCompany",
  "description": "",
  "id": "deletecompany",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1945403900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User logins to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enter the email",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter the password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginApp.user_logins_to_the_application()"
});
formatter.result({
  "duration": 2631246900,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_email()"
});
formatter.result({
  "duration": 131194500,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_password()"
});
formatter.result({
  "duration": 70240000,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_click_on_login_button()"
});
formatter.result({
  "duration": 1172548100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Delete Company with all valid fields",
  "description": "",
  "id": "deletecompany;delete-company-with-all-valid-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@deleteCompany"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user click on the company module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on the bin button and is able to delete the company",
  "keyword": "Then "
});
formatter.match({
  "location": "DeleteCompany.user_click_on_the_company_module()"
});
formatter.result({
  "duration": 2104533600,
  "status": "passed"
});
formatter.match({
  "location": "DeleteCompany.user_clicks_on_the_bin_button_and_is_able_to_delete_the_company()"
});
formatter.result({
  "duration": 4205226600,
  "status": "passed"
});
});