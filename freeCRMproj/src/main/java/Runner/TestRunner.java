package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"},tags= {"@createCompany"})
//@CucumberOptions(features= "src/test/resources/features/ViewEditCompany.feature",glue= {"StepDefinition"},tags= {"@vieweditCompany"})
//@CucumberOptions(features= "src/test/resources/features/DeleteCompany.feature",glue= {"StepDefinition"},tags= {"@deleteCompany"})
//@CucumberOptions(features= "src/test/resources/features/RecoverCompany.feature",glue= {"StepDefinition"},tags= {"@recoverCompany"})
//@CucumberOptions(features= "src/test/resources/features/FilterCompany.feature",glue= {"StepDefinition"},tags= {"@filterCompany"})
//@CucumberOptions(features= "src/test/resources/features/ExportCompany.feature",glue= {"StepDefinition"},tags= {"@exportCompany"})
//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"},tags= {"@createCompany1"})
//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"},tags= {"@createCompany2"})
//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"},tags= {"@createCompany3"})
//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"},tags= {"@createCompany4"})

//@CucumberOptions(features= "src/test/resources/features/CreateCompany.feature",glue= {"StepDefinition"})
//@CucumberOptions(features= "src/test/resources/features/DeleteCompany.feature",glue= {"StepDefinition"})
//@CucumberOptions(features= "src/test/resources/features/RecoverCompany.feature",glue= {"StepDefinition"})
//@CucumberOptions(features= "src/test/resources/features/ViewEditCompany.feature",glue= {"StepDefinition"})
//@CucumberOptions(features= "src/test/resources/features/FilterCompany.feature",glue= {"StepDefinition"})

//for generating reports//**
//@CucumberOptions(features= "src/test/resources/features/ExportCompany.feature",glue= {"StepDefinition"},plugin = { "pretty",
		//"html:TestNGReports/ExportCompany/htmlreport", 
		//"json:TestNGReports/ExportCompany/jsonreport.json",
		//"junit:TestNGReports/ExportCompany/xmlreport.xml",
		//"com.cucumber.listener.ExtentCucumberFormatter:TestNGReports/cucumber-reports/ExportCompany/report.html" })
public class TestRunner extends AbstractTestNGCucumberTests

{

}
