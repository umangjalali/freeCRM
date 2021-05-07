$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/ExportCompany.feature");
formatter.feature({
  "line": 1,
  "name": "ExportCompany",
  "description": "",
  "id": "exportcompany",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2022039300,
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
  "duration": 2489500700,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_email()"
});
formatter.result({
  "duration": 172449000,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_password()"
});
formatter.result({
  "duration": 65326500,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_click_on_login_button()"
});
formatter.result({
  "duration": 1763458200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Export Company with all valid fields",
  "description": "",
  "id": "exportcompany;export-company-with-all-valid-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@exportCompany"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks on company module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on the export button and is able to export the company",
  "keyword": "Then "
});
formatter.match({
  "location": "ExportCompany.user_click_on_the_company_module()"
});
formatter.result({
  "duration": 2108780200,
  "status": "passed"
});
formatter.match({
  "location": "ExportCompany.user_clicks_on_the_export_button_and_is_able_to_export_the_company()"
});
formatter.result({
  "duration": 1944707700,
  "status": "passed"
});
});