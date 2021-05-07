$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RecoverCompany.feature");
formatter.feature({
  "line": 1,
  "name": "RecoverCompany",
  "description": "",
  "id": "recovercompany",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1844885500,
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
  "duration": 3733791800,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_email()"
});
formatter.result({
  "duration": 116648600,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_password()"
});
formatter.result({
  "duration": 64936800,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_click_on_login_button()"
});
formatter.result({
  "duration": 1155253600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Recover Company with all valid fields",
  "description": "",
  "id": "recovercompany;recover-company-with-all-valid-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@recoverCompany"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user click on a company module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on trash button and recovers the company record",
  "keyword": "Then "
});
formatter.match({
  "location": "RecoverCompany.user_click_on_a_company_module()"
});
formatter.result({
  "duration": 2083949600,
  "status": "passed"
});
formatter.match({
  "location": "RecoverCompany.user_clicks_on_trash_button_and_recovers_the_company_record()"
});
formatter.result({
  "duration": 8665839800,
  "status": "passed"
});
});