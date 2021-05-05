package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FreecrmPOM.Company;

//import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteCompany 
{
    WebDriver driver;
	
	Company DeleteCompany = new Company(driver);
	 
	  Company companyData= new Company(driver);
	  
	@When("^user click on the company module$")
	public void user_click_on_the_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	   Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		companyData.companyToSelect();
	}
		
	@Then("^user clicks on the bin button and is able to delete the company$")
	public void user_clicks_on_the_bin_button_and_is_able_to_delete_the_company() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		
		//LoginApp.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/button[1]/i[1]")).click();
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(4000);
		DeleteCompany.delcom();
	}

	
}
