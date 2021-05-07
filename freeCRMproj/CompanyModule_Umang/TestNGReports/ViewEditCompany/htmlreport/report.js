$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ViewEditCompany.feature");
formatter.feature({
  "line": 1,
  "name": "DeleteCompany",
  "description": "",
  "id": "deletecompany",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1946495300,
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
  "duration": 2498539900,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_email()"
});
formatter.result({
  "duration": 129428900,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_password()"
});
formatter.result({
  "duration": 73291700,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_click_on_login_button()"
});
formatter.result({
  "duration": 1121705100,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "view or edit Company with all valid fields",
  "description": "",
  "id": "deletecompany;view-or-edit-company-with-all-valid-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@vieweditCompany"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks on a company module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on edit button and is able to edit",
  "keyword": "Then "
});
formatter.match({
  "location": "ViewEditCompany.user_clicks_on_a_company_module()"
});
formatter.result({
  "duration": 2109645600,
  "status": "passed"
});
formatter.match({
  "location": "ViewEditCompany.user_clicks_on_edit_button_and_is_able_to_edit()"
});
formatter.result({
  "duration": 2548128400,
  "status": "passed"
});
});