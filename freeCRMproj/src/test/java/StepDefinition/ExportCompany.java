package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import FreecrmPOM.Company;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExportCompany 
{
WebDriver driver;
	
	Company ExportCompany = new Company(driver);
	 
	  Company companyData= new Company(driver);
	  
	@Test(priority = 1)	  
	@When("^user clicks on company module$")
	public void user_click_on_the_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		companyData.companyToSelect();
	}
	
	@Test(priority = 2)	
	@When("^user clicks on the export button and is able to export the company$")
	public void user_clicks_on_the_export_button_and_is_able_to_export_the_company() throws Throwable 
	{
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(1000); 
		ExportCompany.expcom();
	}

//	@Then("^user is able to export the company details$")
//	public void user_is_able_to_export_the_company_details() throws Throwable 
//	{
//	   
//	}
//
//	@Then("^user verifies that the record is not downloaded$")
//	public void user_verifies_that_the_record_is_not_downloaded() throws Throwable
//	{
//	  
//	}

}
