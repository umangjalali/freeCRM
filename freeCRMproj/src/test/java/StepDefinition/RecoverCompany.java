package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import FreecrmPOM.Company;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecoverCompany 
{
     WebDriver driver;
	
	Company RecoverCompany = new Company(driver);
	 
	  Company companyData= new Company(driver);
	  
	@When("^user click on a company module$")
	public void user_click_on_a_company_module() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
	    Thread.sleep(2000);
		//LoginApp.driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		companyData.companyToSelect();
	}
	
	@Then("^user clicks on trash button and recovers the company record$")
	public void user_clicks_on_trash_button_and_recovers_the_company_record() throws Throwable
	{
		//LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		//LoginApp.driver.findElement(By.xpath("//i[@class='trash alternate outline icon']")).click();
		LoginApp.driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Thread.sleep(3000);
		  RecoverCompany.reccom();
		Thread.sleep(4000);
	}

//	@Then("^user clicks on the company module button$")
//	public void user_clicks_on_the_company_module_button() throws Throwable 
//	{
//		LoginApp.driver.findElement(By.xpath("//a[normalize-space()='Company (1)']")).click();
//	}
//
//	@Then("^user selects the particular company to be recovered$")
//	public void user_selects_the_particular_company_to_be_recovered() throws Throwable
//	{
//		LoginApp.driver.findElement(By.xpath("//td[@class='collapsing']")).click();
//	}
//
//	@Then("^user clicks on the restore button$")
//	public void user_clicks_on_the_restore_button() throws Throwable
//	{
//		LoginApp.driver.findElement(By.xpath("//button[normalize-space()='Restore Selected']")).click();
//		 Thread.sleep(2000);
//	    LoginApp.driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//	}


}
