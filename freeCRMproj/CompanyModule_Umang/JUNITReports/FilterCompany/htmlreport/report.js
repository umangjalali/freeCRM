$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/FilterCompany.feature");
formatter.feature({
  "line": 1,
  "name": "FilterCompany",
  "description": "",
  "id": "filtercompany",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1997121800,
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
  "duration": 3201474800,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_email()"
});
formatter.result({
  "duration": 219425600,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_enter_the_password()"
});
formatter.result({
  "duration": 63495600,
  "status": "passed"
});
formatter.match({
  "location": "LoginApp.user_click_on_login_button()"
});
formatter.result({
  "duration": 1749476600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "filter Company with all valid fields",
  "description": "",
  "id": "filtercompany;filter-company-with-all-valid-fields",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@filterCompany"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user clicks on the company module",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user clicks on showfilter button and is able to filter the company",
  "keyword": "Then "
});
formatter.match({
  "location": "FilterCompany.user_clicks_on_the_company_module()"
});
formatter.result({
  "duration": 2087714900,
  "status": "passed"
});
formatter.match({
  "location": "FilterCompany.user_clicks_on_showfilter_button_and_is_able_to_filter_the_company()"
});
formatter.result({
  "duration": 3559904300,
  "status": "passed"
});
});