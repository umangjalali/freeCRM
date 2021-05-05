package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FreecrmPOM.Company;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterCompany
{
	 WebDriver driver;
		
		Company FilterCompany = new Company(driver);
		 
		  Company companyData= new Company(driver);
		  
	@When("^user clicks on the company module$")
	public void user_clicks_on_the_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	   Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		companyData.companyToSelect();
	}

	@Then("^user clicks on showfilter button and is able to filter the company$")
	public void user_clicks_on_showfilter_button_and_is_able_to_filter_the_company() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		//LoginApp.driver.findElement(By.xpath("//button[normalize-space()='Show Filters']")).click();
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(3000);
		FilterCompany.filcom("omkar");
	}

//	@Then("^user search the company with the filter criteria$")
//	public void user_search_the_company_with_the_filter_criteria() throws Throwable
//	{
//		//input[@class='search']
//		//div[@name='operator']
//		//div[@class='field value']//input[@placeholder='Value']
//	}
//
//	@Then("^user is able to view the company$")
//	public void user_is_able_to_view_the_company() throws Throwable 
//	{
//		//i[@class='search small icon']
//	}


}
