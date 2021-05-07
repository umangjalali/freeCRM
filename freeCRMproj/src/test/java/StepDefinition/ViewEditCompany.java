package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import FreecrmPOM.Company;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewEditCompany 
{
	WebDriver driver;
	
	Company ViewEditCompany = new Company(driver);
	 
	  Company companyData= new Company(driver);
	 
	  @Test(priority = 1)
	@When("^user clicks on a company module$")
	public void user_clicks_on_a_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		companyData.companyToSelect();
		
	}
	
	  @Test(priority = 2)
	@Then("^user clicks on edit button and is able to edit$")
	public void user_clicks_on_edit_button_and_is_able_to_edit() throws Throwable 
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		//LoginApp.driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[2]/button[1]/i[1]")).click();
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(2000);
		ViewEditCompany.editcom("wer");
	}

	


}
